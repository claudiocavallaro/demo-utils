docker-compose -p project -f docker-compose.yml up -d db;
sleep 10;
docker-compose -p project -f docker-compose.yml up -d app;
