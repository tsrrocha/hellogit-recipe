##################################################################################################################################
###
###   Receita didática para o software HELLOGIT em que o código fonte deste software está armazenado em um repositório git, 
###   que neste caso, utilizaremos o GitHub. Esta receita tem o objetivo de orientar didaticamente o desenvolvedor a criar 
###   um software e instalá-lo em uma distribuição linux customizada.
###################################################################################################################################
SUMMARY = "Receita para criar e instalar o software HELLOGIT utilizando o arquivo Makefile para compilar o software. E, desta vez \
todo o código fonte está armazenado em um repositório público no GitHub."

SECTION = "examples"
PRIORITY = "OPTIONAL"
 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "\ 
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

#Esta variavel remove a verificação do checksum
#BB_STRICT_CHECKSUM = "0"

SRC_URI = "git://github.com/tsrrocha/hellogit.git \
"
SRCREV = "602a1da3f778c725a9a2b72cdafa3b051594b1dc"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'CC=${CC}' 'RANLIB=${RANLIB}' 'AR=${AR}' 'CFLAGS=${CFLAGS} -I${S}/. -DWITHOUT_XATTR' 'BUILDDIR=${S}'"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
  oe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
}
