#!/bin/bash

set -e

npm install express ejs

mvn javafx:run

mvn test

mvn clean package

cd target
mv *.exe ../
cd ..
mv *.exe website/

cd website

node app.js