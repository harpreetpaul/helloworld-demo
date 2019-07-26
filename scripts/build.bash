# Install/Create .jar
mvn clean install -DskipTests --quiet 
# Confirm the .jar was created
ls target/

# Copy the .jar to our volume
cp target/demo-0.0.1-SNAPSHOT.jar /jar/