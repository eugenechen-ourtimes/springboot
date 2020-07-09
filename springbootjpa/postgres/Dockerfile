FROM postgres:alpine
ENV POSTGRES_USER docker
ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB abacus

COPY InitPostgres.sql /docker-entrypoint-initdb.d/
