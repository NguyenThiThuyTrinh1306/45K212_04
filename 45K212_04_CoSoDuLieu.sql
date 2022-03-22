CREATE DATABASE QUANLYCHOTHUESANPHAM
GO
USE QUANLYCHOTHUESANPHAM
GO
CREATE TABLE ACCOUNT
(
	Acc_id       INT not null,
	Username     VARCHAR(20) not null,
	Display_name NVARCHAR(50) not null,
	MatKhau      VARCHAR(30) not null,
	LoaiTaiKhoan BIT not null,
	PRIMARY KEY (Acc_id)	
)
GO
CREATE TABLE KHACHHANG
(
	MaKH           CHAR(8) not null,
	TenKH          NVARCHAR(50) not null,
	CMND           VARCHAR(30) not null,
	NgaySinh       NVARCHAR(30) not null,
	SoDienThoai    VARCHAR(11) not null,
	Diachi         NVARCHAR(100) not null,
	PRIMARY KEY (MaKH)
)
GO 
CREATE TABLE SANPHAM
(
	MaSP         CHAR(5) not null,
	TenSanPham   NVARCHAR(50) not null,
	DonGiaBan    FLOAT not null,
    SoLuongSP    INT not null,
	PRIMARY KEY (MaSP)
)
GO
CREATE TABLE QUANLYDONHANG
( 
	MaDH            CHAR(8) not null,
	MaKH            CHAR(8) not null,
	ThoiGianThue    DATE not null,
	TongTienSPThue  FLOAT,
	TongCong        FLOAT,
	PRIMARY         KEY (MaDH),
	FOREIGN         KEY (MaKH) REFERENCES KHACHHANG,
)
GO
CREATE TABLE QUANLYDONHANGCHITIET
(
	MaDH      CHAR(8) not null,
	MaSP      CHAR(5) not null,
	ThanhTien FLOAT,
	SoLuong   INT not null,
	FOREIGN   KEY (MaDH) REFERENCES QUANLYDONHANG,
	FOREIGN   KEY (MaSP) REFERENCES SANPHAM,
	CONSTRAINT PK_QUANLYDONHANGCHITIET PRIMARY KEY(MaDH, MaSP)
)
GO
