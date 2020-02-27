#Dockerfile APP
FROM openjdk:8u201-jdk-alpine

# Prepare workspace
RUN mkdir -p /usr/share/app

# Add the service itself
COPY target/app.jar /usr/share/app/app.jar

# Start service
RUN sh -c 'touch /usr/share/app/app.jar'
ENTRYPOINT ["java", "-jar", "/usr/share/app/app.jar"]
