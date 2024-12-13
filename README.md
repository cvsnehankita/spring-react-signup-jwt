# spring-react-signup-jwt

This is a simple Spring Boot Maven application that implements user authentication using JSON Web Tokens (JWT) with JWS signing and JSE encryption. It supports:

Sign-up functionality to register new users.
Sign-in functionality to authenticate users and issue JWTs.
JWS (JSON Web Signature) for signing JWTs.
JSE (JSON Web Encryption) for encrypting the JWTs, ensuring data confidentiality.


### API Details
1. SignUp: Allows users to register application by providing email, username and password. Passwords encrypted, before storing into database.
2. SignIn: Users authentication, with their username and password, on success this api returned the JWT token.
3. Users: Fetch all registered user details.
4. Heath: To verify if application is up and running.

Please check the ***Postman/Jwt_Backend_Api.postman_collection*** for api testing.


### Technologies Used
Spring Boot (for backend)
Maven (for Dependency management)
Spring Security (for authentication and security)
JWT (JSON Web Tokens) for stateless authentication
JWS (JSON Web Signature) for signing tokens
JSE (JSON Web Encryption) for encrypting tokens
H2 Database (for local development)
Spring Data JPA (for data persistence)

### Deployment Platforms and Google login platform
1. Heroku is used for Backend deployment, ("https://dashboard.heroku.com")
2. Netlify is used for Frontend deployment, ("https://app.netlify.com")
3. Google Authentication, ("https://console.cloud.google.com")

### API Url: Local Env
*Local: Backend*

1. http://localhost:8080/health
2. http://localhost:8080/api/auth/v1/signup
3. http://localhost:8080/api/auth/v1/signin
4. http://localhost:8080/api/auth/v1/users

*Local: Frontend*

2. http://localhost:3000/signup
3. http://localhost:3000/signin
4. http://localhost:3000/dashboard

*Backend is deployed on Heroku for testing*

1. https://secure-refuge-95775-26d553877570.herokuapp.com/health
2. https://secure-refuge-95775-26d553877570.herokuapp.com/api/auth/v1/signup
3. https://secure-refuge-95775-26d553877570.herokuapp.com/api/auth/v1/signin
4. https://secure-refuge-95775-26d553877570.herokuapp.com/api/auth/v1/users

*Frontend is deployed on Netlify for testing*

1. https://react-frontend-app.netlify.app/signup
2. https://react-frontend-app.netlify.app/signup/signin
3. https://react-frontend-app.netlify.app/dashboard


### Repository
1. Please clone the repository from: "https://github.com/cvsnehankita/spring-react-signup-jwt.git".
2. Please clone frontend application "https://github.com/cvsnehankita/frontend-react-signup-app.git".

### Prerequisites
1. JDK 17+
2. Maven (3.9.9)
3. IntelliJ IDEA IDE
4  H2 Database (In-memory database)
5. Postman (for making HTTP requests)

### Contact
Your suggestions are always welcome as "cvsnehankita@gmail.com".