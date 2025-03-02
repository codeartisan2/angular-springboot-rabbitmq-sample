# Angular + Spring Boot + RabbitMQ Sample

## Setup Instructions

### 🐇 RabbitMQ
Run RabbitMQ locally or via Docker:
```bash
docker run -d --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management
```

### 🔥 Backend (Spring Boot)
- Navigate to `backend-springboot/`
- Run with `mvn spring-boot:run`

### ⚡ Frontend (Angular)
- Navigate to `frontend-angular/`
- Run with `ng serve`

### ➡️ Flow
Angular → Spring Boot → RabbitMQ → Spring Boot Listener