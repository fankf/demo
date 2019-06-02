##本地maven项目推送到GitHub
##1. 新建GitHub项目 demo 地址 git@github.com:fankf/demo.git
##2. 创建本地项目
###2.1 新建本地idea wordspace 新建项目 demo
###2.2. idea Terminal 或者 git bash 打开
###2.3. 设置全局变量
    git config --globaluser.name "user.name"
    git config --global user.email "user.email"
###2.4. demo 项目git初始化 目录下 git init
##3.链接本地和GitHub
    git remote add orgin git@github.com:fankf/demo.git
##4.拉取远程GitHub项目
    git pull origin master
##5.添加本地项目demo的文件到git 本地仓库
    git add .
##6.强制覆盖GitHub项目文件 后续开发不推荐强制 -f
    git push origin master -f


-----------------------------------------------------------

###git分支开发规范
https://www.cnblogs.com/hezhiying/p/9292314.html
分析如下：
master 产品 主分支 大版本  Tag 区分
release 预发产品 分支 开发完成支持提交测试
develop 开发分支
hotfix 紧急修复分支
feature 新功能分支

###合并规则
master 可以合并 release 和 hotfix
release 可以合并 develop
develop 可以合并 feature 和 hotfix

补充： 来自上述网站
当有一组feature开发完成，首先会合并到develop分支，进入提测时，会创建release分支。
如果测试过程中若存在bug需要修复，则直接由开发者在release分支修复并提交。
当测试完成之后，合并release分支到master和develop分支，此时master为最新代码，用作上线。