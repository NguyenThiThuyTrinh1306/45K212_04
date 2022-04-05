INSERT INTO Account (Acc_ID,Username,Display_name,MatKhau)
VALUES (1001,"vttrinh","Võ Thị Tố Trinh","1235"),
	(1002,"nttrinh","Nguyễn Thị Thủy Trinh","1234@5"),
    (1003,"nqhuy","Nguyễn Quang Huy","1235@6");
    
INSERT INTO khachhang (MaKH,Tenkh,CMND,Ngaysinh,SoDienThoai,Diachi)
VALUES (0001,"Nguyễn Thị Thủy Trinh","201832701","2001-02-09","0772691742","Hòa Liên, Hòa Vang, Đà Nẵng"),
		(0002,"Võ Thị Tố Trinh","197480109","2001-05-10","0772691742","Hải Lăng, Quảng Trị");
        
INSERT INTO sanpham (MaSP, Tensanpham,Dongiaban,Soluong)
VALUES (101,"Quả Bóng Chày",5000,100),
		(102,"Bộ Bóng Chày",150000,50),
        (103,"Bóng Chuyền",10000,100),
        (104,"Giáp Taekwondo",100000,50),
        (105,"Bóng Đá",10000,100),
        (106,"Vợt Tennis",60000,50),
        (107,"Gậy Bóng Chày",80000,50),
        (108,"Vợt Cầu Lông",30000,100),
        (109,"Võ Phục Karate",80000,100),
        (110,"Hán Phục",100000,60),
        (111,"Bảo Hộ Hạ Bộ",80000,50),
        (112,"Áo Dài",100000,100),
        (113,"Áo Bà Ba",100000,60);
        
INSERT INTO quanlydonhang (MaDH,MaKH,Ngaythue,Ngaytra)
VALUES (9001,0001,"2021-09-03","2021-09-05");

ALTER TABLE quanlydonhang ADD FOREIGN KEY(MaKH) REFERENCES khachhang(MaKH);

INSERT INTO quanlydonhang (MaDH,MaKH,Ngaythue,Ngaytra)
VALUES (9002,0002,"2021-10-03","2021-10-07");

alter table quanlydonhang add thoigianthue int;

update quanlydonhang
set thoigianthue = datediff(Ngaytra,Ngaythue);

alter table quanlydonhang add TongTienSPThue float;

update quanlydonhang
quanlydonhang join quanlydonhangchitiet on quanlydonhang.MaDH=quanlydonhangchitiet.MaDH join sanpham on quanlydonhangchitiet.MaSP = sanpham.MaSP
set TongTienSPThue = quanlydonhangchitiet.SoLuong*sanpham.Dongiaban*thoigianthue;

alter table quanlydonhang add TongCong float;

INSERT INTO quanlydonhangchitiet (MaDH,MaSP,ThanhTien,SoLuong)
VALUES (9001,101,10000,2),
		(9002,102,150000,1);
        
ALTER TABLE quanlydonhangchitiet ADD FOREIGN KEY(MaDH) REFERENCES quanlydonhang(MaDH);
ALTER TABLE quanlydonhangchitiet ADD FOREIGN KEY(MaSP) REFERENCES sanpham(MaSP);

SET SQL_SAFE_UPDATES=0;

update quanlydonhangchitiet join sanpham on quanlydonhangchitiet.MaSP = sanpham.MaSP
set quanlydonhangchitiet.ThanhTien = quanlydonhangchitiet.SoLuong*sanpham.Dongiaban;

UPDATE quanlydonhang p,( SELECT MaDH, sum(TongTienSPThue)  as TTST
                   FROM quanlydonhang GROUP BY MaDH) as s
   SET p.TongCong = s.TTST
  WHERE p.MaDH = s.MaDH