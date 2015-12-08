# hosts-path
/private/etc/hosts

dscl . list /users
dscl . list /groups

# 端口占用
lsof -i tcp:8080

# 终止进程
kill PID

# 在./路径下查找文件名java结尾的文件
find ./ -name "*.java"