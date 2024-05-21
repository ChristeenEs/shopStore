# Shop Store Project

## Overview

This project is a simple shop store application built with Spring Boot, Maven, and H2 in-memory database. It includes JWT-based authentication for secure API access.

## Features

- User authentication with JWT
- User roles (USER, MODERATOR, ADMIN)
- Basic CRUD operations for products
- In-memory H2 database for development and testing
- API documentation with Swagger

## Technologies Used

- Spring Boot
- Spring Security
- Spring Data JPA
- JWT (JSON Web Tokens)
- H2 Database
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/shopstore.git
    cd shopstore
    ```

2. Build the project with Maven:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

4. Access the application at `http://localhost:8080`.

### H2 Database

The H2 database console is available at `http://localhost:8080/h2-console`. Use the following credentials to log in:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`

### API Documentation

The API documentation is available at `http://localhost:8080/swagger-ui.html`.

## Usage

### Authentication

#### Sign Up

- **URL**: `/api/auth/signup`
- **Method**: `POST`
- **Request Body**:
    ```json
    {
        "username": "your-username",
        "email": "your-email@example.com",
        "password": "your-password"
    }
    ```
- **Response**:
    ```json
    {
        "message": "User registered successfully!"
    }
    ```

#### Sign In

- **URL**: `/api/auth/signin`
- **Method**: `POST`
- **Request Body**:
    ```json
    {
        "username": "your-username",
        "password": "your-password"
    }
    ```
- **Response**:
    ```json
    {
        "token": "your-jwt-token",
        "id": 1,
        "username": "your-username",
        "email": "your-email@example.com",
        "roles": ["ROLE_USER"]
    }
    ```

### Accessing Protected Resources

Include the JWT token in the `Authorization` header for accessing protected endpoints.

#### Get Products

- **URL**: `/api/products/getProducts`
- **Method**: `GET`
- **Headers**:
    ```http
    Authorization: Bearer your-jwt-token
    ```
- **Response**:
    ```json
    [
        {
            "id": 1,
            "name": "Product 1",
            "price": 100.0
        },
        {
            "id": 2,
            "name": "Product 2",
            "price": 150.0
        }
    ]
    ```

## Running Tests

To run the tests, use the following command:
```sh
mvn test
