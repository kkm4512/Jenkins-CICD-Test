FROM jenkins/jenkins:jdk17

USER root
RUN apt-get update && \
    apt-get install -y docker.io  # Docker CLI 설치

