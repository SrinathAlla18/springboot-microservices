# springboot-microservices

The main objective of this project is to develop a data storage system that captures information pertaining to various users within our organization, along with the corresponding department in which each individual works. This endeavor utilizes Spring Boot as the middle-tier framework and leverages the H2 database for the underlying data storage layer.

Within this project, I have primarily focused on implementing the User and Department services following the micro-service architecture. Furthermore, to augment the functionality of these services, I have also incorporated additional services such as the Service Registry using Netflix Eureka, the Cloud Config Server, and the Cloud Gateway. Additionally, to facilitate distributed log tracing, I have integrated Zipkin and Sleuth.

Cloud Config Server:
The primary purpose of the Cloud Config Server is to streamline the management and deployment of configurations across multiple instances or environments. Acting as a centralized system, the Cloud Config Server facilitates the storage and management of configuration information for diverse software applications and services within a cloud environment. It offers a secure and centralized location for storing various configuration settings, including environment variables, database connections, API keys, and other relevant parameters.

Service Registry:
The Service Registry serves as a centralized repository for maintaining information about the available services within the system. It acts as a reliable source of service metadata, enabling services to register themselves and discover other services present in the system.

Cloud Gateway:
The Cloud Gateway acts as a central entry point for external traffic. By implementing a gateway for both the User and Department services, it provides enhanced API management, monitoring capabilities, security features, load balancing, and scalability.

Users and Department:
This application is designed to store user and department details within a company's database. To accomplish this, two separate services have been developed to handle user-related and department-related data individually. The communication between these services is facilitated through RESTful web services, while Spring Data JPA serves as the Object-Relational Mapping (ORM) tool, enabling seamless interaction with the database.