## docker

### 卸载旧版本

```shell
sudo yum remove docker \
         docker-client \
         docker-client-latest \
         docker-common \
         docker-latest \
         docker-latest-logrotate \
         docker-logrotate \
         docker-engine
```

### 安装 Docker Engine-Community

#### 设置仓库

```shell
sudo yum install -y yum-utils \
  device-mapper-persistent-data \
  lvm2
```

#### 安装 Docker Engine-Community

```shell
sudo yum install docker-ce docker-ce-cli containerd.io
```

#### 设置阿里云镜像源

```shell
sudo mkdir -p /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://buh108br.mirror.aliyuncs.com"]
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker
```

#### 设置docker自启动

```shell
sudo systemctl start docker
sudo systemctl enable docker
```

### 安装mysql

```shell
# docker pull mysql:5.7
```
#### docker配置mysql端口映射和文件挂载
```shell
# docker run -p 3306:3306 --name mysql \
 -v /mydata/mysql/log:/var/log/mysql \
 -v /mydata/mysql/data:/var/lib/mysql \
 -v /mydata/mysql/conf:/etc/mysql \
 -e MYSQL_ROOT_PASSWORD=root \
 -d mysql:5.7
```


#### mysql配置

```
# vi /mydata/mysql/conf/my.conf

[client]
default-character-set=utf8
[mysql]
default-character-set=utf8
[mysqld]
init_connect='SET collation_connection = utf8_unicode_ci'
init_connect='SET NAMES utf8'
character-set-server=utf8
collation-server=utf8_unicode_ci
skip-character-set-client-handshake
skip-name-resolve

# docker restart mysql
# 进入mysql
# docker exec -it mysql /bin/bash
```

### 安装redis

```
# 创建文件夹
mkdir -p /mydata/redis/conf
touch /mydata/redis/conf/redis.conf

# 安装redis镜像
docker pull redis

#docker配置
docker run -p 6379:6379 --name redis \
-v /mydata/redis/data:/data \
-v /mydata/redis/conf/redis.conf:/etc/redis/redis.conf \
-d redis redis-server /etc/redis/redis.conf

# 直接进去redis客户端。
docker exec -it redis redis-cli
```

#### redis配置

```
vim /mydata/redis/conf/redis.conf
# 插入下面内容
appendonly yes #持久化
# 保存

docker restart redis

#设置redis容器在docker启动的时候启动
docker update redis --restart=always
```

## 编辑器工具安装

### 安装idea

安装插件 MyBatisX

### 安装maven、jdk

配置settings.xml

```xml
<!-- 配置本地仓库 -->
<localRepository>D:\software\repository</localRepository>

<!-- 配置阿里云镜像 -->
<mirrors>	
	<mirror>
		<id>alimaven</id>
		<name>aliyun maven</name>
		<url>http://maven.aliyun.com/nexus/content/groups/public/</url>
		<mirrorOf>central</mirrorOf>
	</mirror>
</mirrors>

<!-- 配置maven使用的jdk -->
<profile>    
    <id>jdk-15</id>    
    <activation>    
    	<activeByDefault>true</activeByDefault>    
    	<jdk>15</jdk>    
    </activation>    
    <properties>    
    	<maven.compiler.source>15</maven.compiler.source>    
    	<maven.compiler.target>15</maven.compiler.target>   
 	 <maven.compiler.compilerVersion>15</maven.compiler.compilerVersion>    
    </properties>
</profile>
```

### 安装VScode

下载vsCode用于前端管理系统。在vsCode里安装插件。

**Auto Close Tag**
**Auto Rename Tag**
**Chinese**
**ESlint**
**HTML CSS Support**
**HTML Snippets**
**JavaScript ES6**
**Live Server**
**open in brower**
**Vetur**

### 安装git

配置git

```
# 配置用户名
git config --global user.name "Kyon-H"  #//(名字，随意写)
# 配置邮箱
git config --global user.email "a3171218907@qq.com" #// 注册账号时使用的邮箱
# 配置ssh免密登录
ssh-keygen -t rsa -C "a3171218907@qq.com"
三次回车后生成了密钥：公钥私钥
cat ~/.ssh/id_rsa.pub

ssh -T git@github.com
```

