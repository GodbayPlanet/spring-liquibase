#!/bin/bash

echo Re-creating and starting MySQL container...
echo See file 'docker-compose-create-dev-db.yml' for details

# Remove existing DB container and volumes
docker-compose -f docker-compose-create-dev-db.yml down -v
docker-compose -f docker-compose-create-dev-db.yml up -d

echo Docker container started
