FROM jenkins/jenkins:jdk17

USER root
RUN apt-get update && \
    apt-get install -y git openssh-client docker.io  # Git 및 Docker CLI 설치

USER jenkins
