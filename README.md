# org.kie.kogito.kogito-spring-boot-archetype - 1.43.0.Final #

# Running

- Compile and Run

    ```
    mvn clean package spring-boot:run    
    ```

# Test your application

# POST /orders
Allows to create a new order with the given data:

```sh

curl -d '{"order" : {"total": 100.05, "item": {"name": "Asics", "quantity": 35}, "customer": {"name": "Anusha", "address": "123 Cherry Lane", "creditCard": {"name": "Anusha", "number": "123456789", "cvc": "123", "zip": "20147", "expiryDate": "01/25"}}}}, ' -H "Content-Type: application/json" -X POST http://localhost:8080/orders              
```

# Get /orders
Returns list of orders currently active:

```sh

curl -X GET http://localhost:8080/orders                                                       
```

# Developing

Add your business assets resources (process definition, rules, decisions) into src/main/resources.

Add your java classes (data model, utilities, services) into src/main/java.

Then just build the project and run.


# OpenAPI (Swagger) documentation
[Specification at swagger.io](https://swagger.io/docs/specification/about/)

You can take a look at the [OpenAPI definition](http://localhost:8080/v3/api-docs) - automatically generated and included in this service - to determine all available operations exposed by this service. For easy readability you can visualize the OpenAPI definition file using a UI tool like for example available [Swagger UI](https://editor.swagger.io).

In addition, various clients to interact with this service can be easily generated using this OpenAPI definition.
