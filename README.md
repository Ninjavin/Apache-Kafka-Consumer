# Apache Kafka Consumer Application with Spring Boot

This repository contains a Spring Boot application that acts as a Kafka consumer. It demonstrates how to consume messages from a Kafka topic using Apache Kafka and Spring Boot. The application runs on port 9292.

## Prerequisites

Before running the Kafka consumer application, you should have a Kafka cluster set up. If you haven't set up a Kafka cluster yet, refer to the README in this repository for instructions on setting up a Kafka cluster locally on a Windows setup.

## Getting Started with Kafka Consumer Application

Follow these steps to set up and run the Kafka consumer application:

1. **Clone the Repository**: Clone this repository to your local machine using the following command:

   ```sh
   git clone https://github.com/Ninjavin/kafka-consumer-spring-boot.git
   ```

2. **Configure Kafka Properties**:
   - Open the `src/main/resources/application.yml` file.
   - Update the `spring.kafka.bootstrap-servers` property to match your Kafka broker's address (e.g., `localhost:9092`).
   - Update the `spring.kafka.consumer.group-id` property to set a unique consumer group ID.

3. **Build and Run the Application**

4. **Access the Application**:
   - Once the application is running, you can use Offset Explorer to visualize the incoming messages to the Consumer.

5. **Consume Messages**:
   - The application will automatically start consuming messages from the Kafka topic specified in the configuration.
