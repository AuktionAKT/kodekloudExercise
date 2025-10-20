# The Nautilus DevOps team aims to containerize various applications following a recent meeting with the application development team. They intend to conduct testing with the following steps:

# Install docker-ce and docker compose packages on App Server 1.

# Initiate the docker service.

#!/bin/bash

 sudo dnf -y install dnf-plugins-core
 sudo dnf config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
 sudo dnf install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin

 if command -v docker &> /dev/null; then
    echo "✅ Docker installed succes