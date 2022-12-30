INSERT INTO users VALUES('0001','-1714348728','pw1234','01011112222','user01@gmail.com','고마운분',null,'2022-12-06','2022-12-06','일반');
INSERT INTO users VALUES('0002','-1707093011','pw1234','01022223333','user02@gmail.com','귀한분',null,'2022-12-06','2022-12-06','휴면');
INSERT INTO users VALUES('0003','-1704484449','pw1234','01033334444','user03@gmail.com','더귀한분',null,'2022-12-06','2022-12-06','탈퇴');

INSERT INTO address VALUES('1001','0001','서울 영등포구 당산로 지하 121','2022-12-06','2022-12-06','일반');
INSERT INTO address VALUES('1002','0002','서울 영등포구 당산로31길 33','2022-12-06','2022-12-06','일반');
INSERT INTO address VALUES('1003','0003','서울 영등포구 국회대로29길 5','2022-12-06','2022-12-06','일반');
INSERT INTO address VALUES('1004','0004','서울 영등포구 국회대로 597','2022-12-06','2022-12-06','일반');
INSERT INTO address VALUES('1005','0005','서울 영등포구 국회대로 615','2022-12-06','2022-12-06','일반');

INSERT INTO coupon VALUES('2001','0001','신규 가입 쿠폰','1000원 할인','1000','10000','2022-12-06','2022-12-31','2022-12-06','일반');
INSERT INTO coupon VALUES('2002','0002','친구 초대 이벤트 쿠폰','1500원 할인','1500','11000','2022-12-06','2022-12-31','2022-12-06','일반');
INSERT INTO coupon VALUES('2003','0003','더귀한분 쿠폰','2000원 할인','2000','12000','2022-12-06','2022-12-31','2022-12-06','일반');
INSERT INTO coupon VALUES('2004','0004','천생연분 쿠폰','2500원 할인','2500','13000','2022-12-06','2022-12-31','2022-12-06','일반');
INSERT INTO coupon VALUES('2005','0005','사장님 전용 쿠폰','3000원 할인','3000','15000','2022-12-06','2022-12-31','2022-12-06','일반');

INSERT INTO dibs VALUES('3001','1001','9001','2022-12-06','2022-12-06','일반');
INSERT INTO dibs VALUES('3002','1002','9002','2022-12-06','2022-12-06','일반');
INSERT INTO dibs VALUES('3003','1003','9003','2022-12-06','2022-12-06','일반');
INSERT INTO dibs VALUES('3004','1004','9004','2022-12-06','2022-12-06','일반');
INSERT INTO dibs VALUES('3005','1005','9005','2022-12-06','2022-12-06','일반');

INSERT INTO menu VALUES('4001','9001','1인용 찜닭','12000','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','2022-12-06','2022-12-06','일반');
INSERT INTO menu VALUES('4006','9001','혼밥갈비찜','15000','https://recipe1.ezmember.co.kr/cache/recipe/2019/02/09/9377ac695a85566adfda9817b73438f31.jpg','2022-12-06','2022-12-06','일반');
INSERT INTO menu VALUES('4007','9001','김치찌개 정식','13000','https://img-cf.kurly.com/shop/data/goodsview/20211223/gv10000260857_1.jpg','2022-12-28','2022-12-28','일반');
INSERT INTO menu VALUES('4002','9002','족발','22000','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','2022-12-06','2022-12-06','일반');
INSERT INTO menu VALUES('4003','9003','김치찌개','15000','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','2022-12-06','2022-12-06','일반');
INSERT INTO menu VALUES('4004','9004','왕돈까스','13000','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','2022-12-06','2022-12-06','일반');
INSERT INTO menu VALUES('4005','9005','포테이토 피자','18000','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','2022-12-06','2022-12-06','일반');

INSERT INTO orders VALUES('6001','0001','9001','서울 영등포구 선유로 130','에이스하이테크시티3차 TIS정보교육학원','01012345678','0',null,'2022-12-06','2022-12-06','일반');
INSERT INTO orders VALUES('6002','0002','9002','서울 영등포구 선유로 130','에이스하이테크시티3차 TIS정보교육학원','01012345678','0',null,'2022-12-06','2022-12-06','일반');
INSERT INTO orders VALUES('6003','0003','9003','서울 영등포구 선유로 130','에이스하이테크시티3차 TIS정보교육학원','01012345678','0',null,'2022-12-06','2022-12-06','일반');
INSERT INTO orders VALUES('6004','0004','9004','서울 영등포구 선유로 130','에이스하이테크시티3차 TIS정보교육학원','01012345678','0',null,'2022-12-06','2022-12-06','일반');
INSERT INTO orders VALUES('6005','0005','9005','서울 영등포구 선유로 130','에이스하이테크시티3차 TIS정보교육학원','01012345678','0',null,'2022-12-06','2022-12-06','일반');

INSERT INTO order_menu VALUES('6001','4001','1');
INSERT INTO order_menu VALUES('6001','4006','2');
INSERT INTO order_menu VALUES('6002','4002','2');
INSERT INTO order_menu VALUES('6003','4003','3');
INSERT INTO order_menu VALUES('6004','4004','4');
INSERT INTO order_menu VALUES('6005','4005','2');

INSERT INTO review VALUES('8001', '6001','4.0','맛있었어요!','2022-12-06','2022-12-06','일반');
INSERT INTO review VALUES('8002', '6002','4.5','족발 맛있네요','2022-12-06','2022-12-06','일반');
INSERT INTO review VALUES('8003', '6003','3.5','김치가 짜요','2022-12-06','2022-12-06','일반');
INSERT INTO review VALUES('8004', '6004','2.5','고기가 질기네요','2022-12-06','2022-12-06','일반');
INSERT INTO review VALUES('8005', '6005','3.0','무난한 피자입니다..','2022-12-06','2022-12-06','일반');

INSERT INTO store VALUES('9001','0','혼밥하기 좋은날1','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9006','0','혼밥하기 좋은날2','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9007','0','혼밥하기 좋은날3','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9008','0','혼밥하기 좋은날4','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9009','0','혼밥하기 좋은날5','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9010','0','혼밥하기 좋은날6','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9011','0','혼밥하기 좋은날7','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9012','0','혼밥하기 좋은날8','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9013','0','혼밥하기 좋은날9','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9014','0','혼밥하기 좋은날10','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9015','0','혼밥하기 좋은날11','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9016','0','혼밥하기 좋은날12','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9017','0','혼밥하기 좋은날13','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9018','0','혼밥하기 좋은날14','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9019','0','혼밥하기 좋은날15','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9020','0','혼밥하기 좋은날16','서울 영등포구 영중로 125','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','10000',null,null,NULL,'3.5','1253','126','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9002','1','장수 왕족발/보쌈','서울 영등포구 여의도동 15-22','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','11000',null,null,NULL,'3.6','103','182','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9003','2','제일 김치찌개','서울 영등포구 여의도동 37','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','12000',null,null,NULL,'2.5','13','712','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9004','3','명동 왕돈까스','서울 영등포구 신길동 464-1','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','13000',null,null,NULL,'4.5','18','412','2022-12-06','2022-12-06','일반');
INSERT INTO store VALUES('9005','4','웃음꽃 피자','서울 영등포구 신길동 4945','https://i.pinimg.com/564x/49/70/31/4970315bc64284052adc2dd17cfa1d03.jpg','021234566','안녕하세요. 맛있게 드세요!','14000',null,null,NULL,'4.7','253','1562','2022-12-06','2022-12-06','일반');

INSERT INTO store_type VALUES('0','1인분');
INSERT INTO store_type VALUES('1','족발/보쌈');
INSERT INTO store_type VALUES('2','찜/탕/찌개');
INSERT INTO store_type VALUES('3','돈까스/회/일식');
INSERT INTO store_type VALUES('4','피자');
INSERT INTO store_type VALUES('5','고기/구이');
INSERT INTO store_type VALUES('6','야식');
INSERT INTO store_type VALUES('7','양식');
INSERT INTO store_type VALUES('8','치킨');
INSERT INTO store_type VALUES('9','중식');
INSERT INTO store_type VALUES('10','아시안');
INSERT INTO store_type VALUES('11','백반/죽/국수');
INSERT INTO store_type VALUES('12','도시락');
INSERT INTO store_type VALUES('13','분식');
INSERT INTO store_type VALUES('14','카페/디저트');
INSERT INTO store_type VALUES('15','패스트푸드');

INSERT INTO review_picture VALUES('8001', 'picture1.jpg');
INSERT INTO review_picture VALUES('8002', 'picture1');
INSERT INTO review_picture VALUES('8003', 'picture1');
INSERT INTO review_picture VALUES('8004', 'picture1');
INSERT INTO review_picture VALUES('8005', 'picture1');
INSERT INTO review_picture VALUES('8001', 'picture2.jpg');
INSERT INTO review_picture VALUES('8001', 'picture3.jpg');