# CareCicle

### Saúde Inclusiva, aplicação dedicada a oferecer cuidados de saúde personalizados para pessoas LGBTQIA+.
### Obs: Acesse a pasta Domain Driver Design

## Visão Geral

Reconhecendo as necessidades únicas dessas comunidades, desenvolvemos uma plataforma abrangente que aborda lacunas de acesso à saúde e fornece informações específicas. O aplicativo oferece informações abrangentes sobre saúde sexual (Através de postagens), uma seção dedicada ao ciclo menstrual do usuario, e oferece uma indicação de hospitais próximos. Além disso, conectamos os usuários a e-commerces com produtos voltados para a saúde dessas comunidades. Com perfis de usuários e funcionalidades personalizadas, estamos comprometidos em proporcionar uma experiência inclusiva e respeitosa. Junte-se a nós nesta jornada em direção a uma saúde mais igualitária e personalizada, cuidando de você com amor e respeito.

## Estrutura do Repositório

Este repositório representa o projeto CareCircle, cada pasta representa uma matéria, domain driver desing (JAVA), building relational database (BD) etc, a aplicação explicada logo abaixo, esta na pasta Domain Driver Desing.

## Estrutura da Aplicação

- **Program (Main):** A classe principal que inicia a aplicação e interage com o usuário por meio de menus. Direciona para menus específicos com base no login e nas permissões da conta.

- **Repository:** Classe responsável pelo armazenamento e manipulação de dados. Contém listas para entidades como contas, grupos de apoio, ciclos menstruais, etc. Fornece métodos para operações relacionadas a essas entidades.

## Funcionalidades Principais

- **Login e Cadastro:** Os usuários podem fazer login ou se cadastrar. O Repository verifica e gerencia contas.

- **Menus de Usuário e Administrador:** Direciona usuários para menus específicos com base nas permissões da conta.

- **Operações Específicas:** Realiza operações como adicionar ciclos menstruais, participar de grupos de apoio e listar informações associadas.

- **Uso do Repository:** O Repository é utilizado para acessar e manipular dados, proporcionando uma interação modular com a aplicação.
