# hellogit-recipe
Este é um projeto para armazenar o arquivo de receita para o software ***hellogit***. E foi criado para fins didático.
Este software é armazenado em um repositório *git* no **GitHub** e é mantido por ***Tiago Sousa Rocha***.

[**HelloGIT** - https://github.com/tsrrocha/hellogit.git](https://github.com/tsrrocha/hellogit.git)

---

### Variáveis utilizadas na receita
- **SUMMARY**:  
Traz uma descrição sobre a receita.

- **SECTION**:

- **PRIORITY**:

- **LICENSE**:  
Define o tipo de licença a ser utilizada pelo software.  

- **LIC_FILES_CHKSUM**:  
Informa o checksum do arquivo de licença para validar que não esteja corrompido.

- **BB_STRICT_CHECKSUM**:  
Esta variável está comentada nesta receita, mas ela com o valor "**0**" remove a validação do checkum do código fonte.

- **SRC_URI**:  
Informa onde está localizado o código fonte deste software para que o *OpenEmbedded Build System* possa baixar.

- **SRCREV**:  
Como estamos utilizando um repositório *GIT*, então, esta variável contém o código do commit.

- **S**:  
Esta variável contem a informação de onde será armazenado o código fonte do software após ser baixado através do método do_fetch(), e no nosso caso, como estamos utilizando um repositório *GIT* esta variável é configurada para "**${WORKDIR}/git**".

- **EXTRA_OEMAKE**:  
Esta variável contem os parâmetros adicionais que o *OpenEmbedded Build System* irá repassar para o **make** e assim compilar corretamente o nosso software.

- **TARGET_CC_ARCH**:  


---

**Desenvolvedor**: Tiago Sousa Rocha (tsrrocha@gmail.com)  -  **Whatsapp**: +55 83 9 8111-5793

---