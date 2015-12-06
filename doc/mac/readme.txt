#hosts-path
/private/etc/hosts

dscl . list /users
dscl . list /groups

#端口占用
lsof -i tcp:8080

#终止进程
kill PID