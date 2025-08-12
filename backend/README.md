# 🛍️ E-commerce Backend API (Java Spring Boot)

This is a backend API for a simple e-commerce platform built with **Spring Boot**, supporting essential features such as user authentication, product management, orders, and categories.

## 🚀 Technologies Used

- Java 17, Spring Boot
- Spring Security with JWT
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Postman (for API testing)

---

## 📦 Features

- ✅ Register & Login (JWT-based auth)
- 👤 User management (admin + current user info)
- 📦 Product & category CRUD operations
- 🛒 Shopping cart & order placement
- 🌍 Address management
- 🔎 Search by product name

---

## 🗂️ Project Structure

├── config/ → Security, JWT, CORS config
├── controller/ → REST API endpoints
├── dto/ → Data Transfer Objects
├── entity/ → JPA Entities (User, Product, Order...)
├── enums/ → Enum definitions (OrderStatus, UserRole)
├── exception/ → Custom exceptions & handlers
├── mapper/ → Model mappers (Entity <-> DTO)
├── repository/ → Spring Data JPA interfaces
├── security/ → JWT auth logic
├── service/ → Business logic implementation
├── specification/ → Query specifications
└── ThuanEcommerceApplication.java → App entry point

## 📬 Sample API Endpoints

### 🔐 Auth
- `POST /auth/register` – Register a new user
- `POST /auth/login` – Login and receive JWT token

### 👤 User
- `GET /user/get-all` – Get all users
- `GET /user/my-info` – Get current logged-in user's info and order history

### 🛍️ Product
- `POST /product/create` – Create a new product
- `GET /product/get-all` – Get all products
- `GET /product/get-by-product-id/{id}` – Get product details by ID
- `GET /product/get-by-category-id/{categoryId}` – Get products by category
- `GET /product/search?searchValue=` – Search for products
- `PUT /product/update` – Update a product
- `DELETE /product/delete/{id}` – Delete a product

### 📁 Category
- `POST /category/create` – Create new category
- `GET /category/get-all` – Get all categories
- `PUT /category/update/{id}` – Update a category
- `DELETE /category/delete/{id}` – Delete a category

### 🚚 Order
- `POST /order/create` – Place an order
- `GET /order/filter` – Filter orders (by itemId or status)
- `PUT /order/update-item-status/{itemId}?status=` – Update status of an order item

### 📦 Address
- `POST /address/save` – Save or update delivery address
