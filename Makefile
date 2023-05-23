build-image:
	@ docker build -f devops/Dockerfile -t grupo3backend:1 .
volume:
	@ docker volume create pg_tendencia_grupotres
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml grupo3
rm:
	@ docker stack rm grupo3