/*
 사용자 생성
 */

CREATE USER BLUNA IDENTIFIED BY "BLUNA123!@"
PROFILE DEFAULT
ACCOUNT UNLOCK;

GRANT DBA, RESOURCE, CONNECT TO BLUNA;