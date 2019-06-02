##本地maven项目推送到GitHub
##1. 新建GitHub项目 demo 地址 git@github.com:fankf/demo.git
##2. 创建本地项目
###2.1 新建本地idea wordspace 新建项目 demo
###2.2. idea Terminal 或者 git bash 打开
###2.3. demo 项目git初始化 目录下 git init
##3.链接本地和GitHub
## git remote add orgin git@github.com:fankf/demo.git
##4.拉取远程GitHub项目
## git pull origin master
##5.添加本地项目demo的文件到git 本地仓库
## git add .
##6.强制覆盖GitHub项目文件 后续开发不推荐强制 -f
## git push origin master -f