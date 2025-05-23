# ✅ Checkpoint 3 - API em Spring Boot

## 📌 Requisitos do Projeto

- Java 17 ou 18
- Spring Boot 3.4.*
- Maven
- Spring Web
- Spring DevTools
- Swagger 
- Banco de dados 
- API REST com os seguintes endpoints:

### Endpoints obrigatórios:

#### 🧑 Pacientes
- `POST /pacientes`
- `GET /pacientes?sort=asc|desc`
- `GET /pacientes/{id}`
- `PUT /pacientes/{id}`
- `DELETE /pacientes/{id}`

#### 👨‍⚕️ Profissionais
- `POST /profissionais`
- `GET /profissionais?sort=asc|desc`
- `GET /profissionais/{id}`
- `PUT /profissionais/{id}`
- `DELETE /profissionais/{id}`

#### 📅 Consultas
- `POST /consultas`
- `GET /consultas`
- `GET /consultas/{id}`
- `PUT /consultas/{id}`
- `DELETE /consultas/{id}`

#### 📊 Consultas específicas
- `GET /profissionais/{id}/stats`
- `GET /pacientes/{id}/consultas?status={AGENDADA, REALIZADA, CANCELADA}`
- `GET /profissionais/{id}/consultas?status={AGENDADA, REALIZADA, CANCELADA}`
- `GET /consultas?status={AGENDADA, REALIZADA, CANCELADA}`

---

## 🛠️ Tecnologias utilizadas

- Java 17
- Spring Boot 3.4
- Maven
- Spring Web
- Spring DevTools
- SpringDoc OpenAPI (Swagger)
- JPA/Hibernate
