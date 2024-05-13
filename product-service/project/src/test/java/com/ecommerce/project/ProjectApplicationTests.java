package com.ecommerce.project;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProjectApplicationTests {

	@ServiceConnection
	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:7.0.5");
	@LocalServerPort
	private Integer port;

	@BeforeEach
	void setup(){
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = port; //Wherever random port is running injects it into port variable

	}
	static {
		mongoDBContainer.start();
	}

	@Test
	void shouldCreateProduct() {
		String requestBody = """
				{"name": "GO Electric Toothbrush",
				 "description": "Electric Toothbrush Purple and White",
				 "price": 18.9
				}
				""";

		RestAssured.given().contentType("application/json").body(requestBody).when().post("/api/product").then().statusCode(201).body("id", Matchers.notNullValue()).body("name",Matchers.equalTo("GO Electric Toothbrush")).body("description",Matchers.equalTo("Electric Toothbrush Purple and White"));

	}

}
