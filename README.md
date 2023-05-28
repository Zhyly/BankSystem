# Bank System
目前总共14个接口

| 接口                                                         | 说明                                                         | 样例                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| [http://120.79.139.163/bank/account/get/info/](http://120.79.139.163/bank/account/get/info/1){uid} | 根据用户ID获取用户信息                                       | [120.79.139.163/bank/account/get/info/1](http://120.79.139.163/bank/account/get/info/1) |
| http://120.79.139.163/bank/account/register                  | 注册账号，注册成功后会返回随机生成的账号                     | ![image-20220519183747773]((https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220519183747773.png) |
| http://120.79.139.163/bank/account/login                     | 登录账号，登录成功后返回该用户所有信息                       | ![image-20220518012826193](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220518012826193.png) |
| [http://120.79.139.163/bank/card/add](http://120.79.139.163/bank/card/add) | 添加银行卡                                                   | ![image-20220518014721734](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220518014721734.png) |
| http://120.79.139.163/bank/card/get/{uid}                    | 通过传入用户ID获取该用户所有银行卡信息                       | http://120.79.139.163/bank/card/get/1                        |
| http://120.79.139.163/bank/card/del/{uid}                    | 通过传入银行卡ID删除该银行卡                                 | http://120.79.139.163/bank/card/del/8                        |
| http://120.79.139.163/bank/order/add                         | 添加交易记录，type为1代表取钱，0代表存钱                                                 | ![image-20220518025331331](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220518025331331.png) |
| [http://120.79.139.163/bank/card/get](http://120.79.139.163/bank/card/get){cid} | 通过传入银行卡ID获取该银行卡对应的所有交易数据信息           | http://120.79.139.163/bank/order/get/1                       |
| http://120.79.139.163/bank/order/transfer                    | 银行卡之间的转账。srcCid是转账发起方的银行卡号，distCid是接收方的银行卡号，uid对应的是转账发起方的UID，amount是转账金额 | ![image-20220518031027272](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220518031027272.png)![image-20220518030650655](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220518030650655.png) |
| <form *action*="http://120.79.139.163/bank/file/avatar" *method*="post" *enctype*="multipart/form-data"> | 上传头像，并且返回UUID，可以在公网/bank/avatar下访问该头像[5bc49f28-6a27-4883-b27c-48a803b65c74.png (2560×1600)](http://120.79.139.163/bank/avatar/5bc49f28-6a27-4883-b27c-48a803b65c74.png)，头像大小不得超过1M，且不能为空 | ![image-20220518033157541](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220518033157541.png) |
| http://120.79.139.163/bank/file/avatar/get/{uid}             | 根据用户ID获取UUID                                           | http://120.79.139.163/bank/file/avatar/get/1                 |
| http://120.79.139.163/bank/page/order                        | 获取分页订单数据                                             | ![image-20220519183147650](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220519183147650.png) |
| http://120.79.139.163/bank/page/card                         | 获取分页银行卡数据                                           | ![image-20220519220528161](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220519220528161.png) |
| http://120.79.139.163/bank/account/update                    | 更新用户信息，更新时如果输入的身份证号重复则返回错误提示     | ![image-20220519222558141](https://github.com/Adam-ly-captain/SSM/blob/master/img/image-20220519222558141.png) |




![image-20230517100013947](https://github.com/Zhyly/BankSystem/assets/96356893/a6c6e3d3-2282-4fee-95e1-be06d278b3b9)
![image-20230517100030518](https://github.com/Zhyly/BankSystem/assets/96356893/15e1b2c0-b060-4c8d-8b0b-efd329af65cf)
![image-20230517100045059](https://github.com/Zhyly/BankSystem/assets/96356893/ba39444a-c93d-412c-9532-b355ebbbf32a)
![image-20230517100058892](https://github.com/Zhyly/BankSystem/assets/96356893/a710aee1-4ce4-4a5b-ba89-844f92e2e626)


![image-20230517104012559](https://github.com/Zhyly/BankSystem/assets/96356893/a1a81f78-3fd9-4660-b96f-2d2df353d5a0)
![Screenshot_2023-05-17-10-59-23-36_e6133c59731d4ff6e280b1fde0f05acc](https://github.com/Zhyly/BankSystem/assets/96356893/1eefa2b9-8a21-4c1d-846c-e8801cf2a895)










![image-20230517113658843](https://github.com/Zhyly/BankSystem/assets/96356893/ea172ef4-28c0-4c60-8d76-464cfba5c62c)
![image-20230517113728183](https://github.com/Zhyly/BankSystem/assets/96356893/c2913edb-60a0-4888-8972-59fc9d17dc3d)

![image-20230517114326916](https://github.com/Zhyly/BankSystem/assets/96356893/29cd9e76-d300-4f9f-91c8-c600568100a6)
![image-20230517114349736](https://github.com/Zhyly/BankSystem/assets/96356893/7ff1d675-8db8-403c-a43e-7120d70bb29e)
![Screenshot_2023-05-17-10-59-23-36_e6133c59731d4ff6e280b1fde0f05acc](https://github.com/Zhyly/BankSystem/assets/96356893/7c07d08c-5891-4634-a0c3-8d776bcd1c73)




![image-20230528222000904](https://github.com/Zhyly/BankSystem/assets/96356893/cd1bffa7-9460-4424-8e36-dc6141d2378d)
![image-20230528222009611](https://github.com/Zhyly/BankSystem/assets/96356893/1cc3d86e-2b26-40c4-b9c4-a85574225390)
![image-20230528222042586](https://github.com/Zhyly/BankSystem/assets/96356893/485c1673-04bb-4ba4-8d27-c0d20f3708e1)
![image-20230528222136813](https://github.com/Zhyly/BankSystem/assets/96356893/bb3f29d0-ab8e-4f45-9822-304ea7ec5cb1)
![image-20230528222200054](https://github.com/Zhyly/BankSystem/assets/96356893/022207d7-5bf5-4504-9fc0-4aadd4f96504)
![image-20230528222216548](https://github.com/Zhyly/BankSystem/assets/96356893/0aab75ad-3f31-4834-9a93-64c6c31b7ef9)
![image-20230528222228406](https://github.com/Zhyly/BankSystem/assets/96356893/f031fb27-8002-4cf5-8403-10dc3d435887)




![image-20230528222305469](https://github.com/Zhyly/BankSystem/assets/96356893/11ff5dc1-7c46-44bf-b198-fb1c36f40c82)



![image-20230528222323678](https://github.com/Zhyly/BankSystem/assets/96356893/eee7458d-2dc8-4bf2-805e-85a0a25fa041)
![image-20230528222344211](https://github.com/Zhyly/BankSystem/assets/96356893/d7728713-bd07-445b-a49e-7e51df6984a3)
![image-20230528222437570](https://github.com/Zhyly/BankSystem/assets/96356893/14c66a18-9c39-4f52-bedd-3ff66d557bc6)
![image-20230528222448819](https://github.com/Zhyly/BankSystem/assets/96356893/bc4284e6-fcbc-4806-a6b1-98a814fa6d54)






