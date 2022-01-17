Spring的使用案例

# 环境配置

## docker
这个是最重要的东西

## mysql
docker pull mysql
docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -p 3306:3306 -d mysql

## redis
docker pull redis:6.2.5
docker run -p 6379:6379 --name redis -d redis
redis-cli -h some-redis-ip -p some-port


