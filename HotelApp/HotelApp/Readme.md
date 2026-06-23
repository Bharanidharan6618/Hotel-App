# Majestic Hotel Management System

A full-stack hotel management solution built with Spring Boot (Backend) and Vanilla HTML/CSS/JS (Frontend).

## Prerequisites
- **Java 17** or higher
- **Maven**
- **MySQL Server**

## Setup Instructions

### 1. Database Setup
1. Open your MySQL client.
2. Create a database named `hotel_db`:
   ```sql
   CREATE DATABASE hotel_db;
   ```
3. Update `backend/src/main/resources/application.properties` with your MySQL username and password.

### 2. Backend (Spring Boot)
1. Navigate to the `backend` folder.
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```
   The backend will start on `http://localhost:8080`.

### 3. Frontend
1. Open `frontend/index.html` in your web browser.
2. Register a new account and log in.
3. Start managing your hotel!

## Features
- **Modern Dashboard**: High-level statistics and recent activity.
- **Room Management**: Add, view, and delete rooms.
- **Booking Management**: Create reservations for customers.
- **Customer Registry**: Keep track of guest details.
- **Hotel Settings**: Manage your hotel's public profile.
- **Secure Authentication**: Basic login and registration system.

## Project Structure
- `backend/`: Spring Boot source code, models, and controllers.
- `frontend/`: Responsive UI built with Vanilla CSS and JS.
