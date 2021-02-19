# 指定基础镜像
FROM registry.cn-zhangjiakou.aliyuncs.com/ylns/alpine-openjdk-b7-t1:1.0.0
# 维护者信息
MAINTAINER yunli-xcube
# 用于指定持久化目录
#VOLUME /tmp
#ENV APP_DIR /yunli/xcube/app

ENV JAR_FILE_NAME=mybatis-0.0.1-SNAPSHOT-exec.jar
ENV SPRING_PROFILES_ACTIVE=dev
ENV JAR_XMS=256M
ENV JAR_XMX=512M
#默认APP名称 skywalking注册用
#ENV APP_NAME=
# 将本地文件添加到容器中
ADD ${JAR_FILE_NAME} ${JAR_FILE_NAME}
# 指定于外界交互的端口
EXPOSE 8088
# 配置容器，使其可执行化
#ENTRYPOINT ["java","-Xms${JAR_XMS:256M} -Xmx${JAR_XMX:512M}", "-jar ${JAR_FILE_NAME}","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
CMD java -Xms${JAR_XMS:-256M}  -Xmx${JAR_XMX:-512M} -jar ${JAR_FILE_NAME} --spring.profiles.active=${SPRING_PROFILES_ACTIVE}