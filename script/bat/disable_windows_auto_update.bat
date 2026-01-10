rem disable windows auto update

@echo off

chcp 1251

echo disable windows auto update service ...
net stop wuauserv

echo changing windows auto update service startup type to 'disabled' ...
sc config wuauserv start=disabled

echo done

exit
