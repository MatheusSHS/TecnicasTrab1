FROM maven:3-jdk-8
RUN apt-get install git 
WORKDIR /usr/lib
RUN wget https://github.com/OpenJML/OpenJML/releases/download/0.8.42/openjml-0.8.42-20190401.zip 
RUN mkdir openjml && mv openjml-0.8.42-20190401.zip openjml/ 
RUN cd ./openjml && unzip openjml-0.8.42-20190401.zip 
RUN cd ./openjml && rm openjml-0.8.42-20190401.zip 
RUN cd ./openjml && ls -las 
WORKDIR /usr/src