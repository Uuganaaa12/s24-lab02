@echo off
mvn clean package
java -cp target/lab02-1.0-SNAPSHOT.jar edu.cmu.cs.cs214.lab02.Main