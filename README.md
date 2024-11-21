# Full-stack Movie Streaming App

A full-stack web application designed to allow users to explore movies, watch trailers, and interact by adding reviews. It uses React on the frontend and Spring Boot on the backend with MongoDB for data persistence.

![thumbnail](https://github.com/tunde262/movie_streaming_app_spring_react_mongo/blob/main/assets/thumbnail.gif?raw=true)

## Project Goal
The goal of this project is to demonstrate proficiency in building RESTful APIs with Spring Boot, integrating a MongoDB NoSQL database for data storage, and using React to create a dynamic and interactive user interface.

## Features
- **RESTful API**: Efficiently designed with repository and service layers for seamless data access and processing.
- **Movie Management**: View all movies and their details, including posters, genres, and YouTube trailers.
- **Review System**: Add new reviews and view existing reviews for any movie.
- **YouTube Integration**: Play trailers using `react-player`.
- **Frontend-Backend Communication**: Smooth interaction using Axios for API requests.

## Technologies Used
- **Backend**: Spring Boot, MongoDB
- **Frontend**: React, JavaScript, HTML, CSS
- **API Testing**: Postman
- **Database**: NoSQL (MongoDB)
- **Development Tools**: Visual Studio Code, IntelliJ IDEA

## Project Architecture
The project follows a clean architecture with a separation of concerns:
- **Frontend**: Built with React and styled using CSS for an intuitive user interface.
- **Backend**: Powered by Spring Boot with RESTful endpoints for handling API requests.
- **Database**: MongoDB stores movie and review data, ensuring scalability and flexibility.

### Backend Components
1. **Controller Layer**:
   - Handles API requests and routes them to the appropriate service layer.
   - Example: `MovieController`, `ReviewController`.
   
2. **Service Layer**:
   - Implements the business logic and interacts with the repository layer.
   - Example: `MovieService`, `ReviewService`.

3. **Repository Layer**:
   - Directly communicates with MongoDB for CRUD operations.
   - Example: `MovieRepository`, `ReviewRepository`.

### Frontend Components
1. **Main App**:
   - Manages global state for movies and reviews.
   - Routes defined using `react-router-dom`.

2. **UI Features**:
   - `Home`: Displays a list of all movies.
   - `Reviews`: Shows movie reviews and allows adding new ones.
   - `Trailer`: Plays YouTube trailers.

## API Endpoints
- **GET /api/v1/movies**: Fetch all movies.
- **GET /api/v1/movies/{imdbId}**: Fetch a single movie by its IMDB ID.
- **POST /api/v1/reviews**: Add a review for a movie.
  
## Setup Instructions
### Prerequisites
- Java 17+
- Node.js and npm
- MongoDB (local or cloud instance)

### Backend Setup
1. Clone the repository:
   
   ```bash
   git clone https://github.com/tunde262/movie_streaming_app_spring_react_mongo.git

2. Navigate to the backend directory:
   
   ```bash
   cd server
   
3. Configure your MongoDB connection by creating a `.env` file in the `resources` folder. For reference, you can use the `.env.example` file provided in the project.

   ```bash
   MONGO_DATABASE=
   MONGO_USER=
   MONGO_PASSWORD=
   MONGO_CLUSTER=
   ```
   **Note:** Make sure to replace the MongoDB credentials with your own.
   
4. Run the application:
   
   ```bash
   ./mvnw spring-boot:run
   ```
   The backend server will start at `http://localhost:8080`.

### Frontend Setup
1. Navigate to the frontend directory:
   
   ```bash
   cd frontend

2. Install dependencies:
   
   ```bash
   npm install
   
3. Start the application:
   
   ```bash
   npm start
   ```
   The frontend will be available at `http://localhost:3000`.
