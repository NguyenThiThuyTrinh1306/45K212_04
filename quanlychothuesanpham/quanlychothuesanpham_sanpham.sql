-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quanlychothuesanpham
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `MaSP` int NOT NULL AUTO_INCREMENT,
  `TenSanPham` varchar(255) NOT NULL,
  `DonGiaBan` float NOT NULL,
  `SoLuongSP` int NOT NULL,
  `HinhAnh` varchar(255) DEFAULT NULL,
  `MoTa` text,
  PRIMARY KEY (`MaSP`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (1,'Qua bong chay',5000,100,'img/QuaBongChay.jpg','Bóng chày là một trong những môn thế thao mới được đưa vào Việt Nam nhưng đã được rất nhiều người đón nhận và càng ngày càng trở nên phổ biến. Trong môn bóng chày thì quả bóng chày là một trong những yếu tố không thể thiếu được trong luyện tập cũng như thi đấu. Quả bóng chày có cấu tạo bằng cao su và vỏ bọc ở ngoài bằng da, đường kính 2,7/ 8 inch đến 3 inch, được quấn nối bằng các sợi chỉ hoặc dây màu. Bóng có hai loại: bóng mềm dùng cho tập luyện và bóng cứng dành cho thi đấu.'),(2,'Bo bong chay',150000,55,'img/BoBongChay.jpg','Bóng chày không phải môn thể thao phổ biến của nước ta. nhưng do sự du nhập của nhiều nền văn hóa, bóng chày cũng trở nên được ưa chuộng, nhiều người luyện tập. Dụng cụ chơi bóng chày là những yêu cầu cần thiết để làm quen và chơi bóng tốt nhất. Gậy bóng chày được phát triển thành nhiều loại thu hút người chơi lựa chọn để thực hiện động tác tốt nhất.'),(3,'Bong chuyen',10000,66,'img/BongChuyen.jpg','Việc tăng cường rèn luyện thể thao luôn được các bạn trẻ yêu thích, bóng chuyền là một môn học được nhà trường áp dụng vào giảng dạy, môn học được rất nhiều sinh viên đăng kí tham gia với số lượng bóng khá giới hạn. Website cung cấp cho các bạn số lượng bóng và thời gian thoải mái với giá thành phải chăng, đảm bảo cho bạn hiệu suất tập luyện hiệu quả khi không có nhu cầu để mua một quả bóng với giá thành đắt đỏ.'),(4,'Giap taekwondo',100000,40,'img/GiapTaeKwondo.jpg','Bảo hộ thi đấu Taekwondo trọn bộ - là sản phấm được công nhận là sản phẩm bảo hộ thi đấu chính thức ở các giải thi đấu dành cho các vận động viên Taekwondo, Chất lượng sản phẩm được đảm bảo an toàn khi sử dụng. Chất liệu: Mút EVA, Simily cao cấp'),(5,'Bong da',10000,29,'img/BongDa.jpg','Bóng đá là một môn thể thao quốc dân ở Việt Nam. Hiện nay có rất nhiều câu lạc bộ và lớp học bóng đá trên khắp cả nước, dành cho trẻ em đến người lớn. Tại Đại học kinh tế cũng luôn diễn ra những trận bóng đá giữa các khoa với nhau với quy mô lớn. Quả bóng đá là một vật dụng không thể thiếu đối với những bạn đam mê môn thể thao vua này, nhưng với các thương hiệu đa đạng như Adidas, Molten, Spalding, Động Lực,…'),(6,'Vot tennis',60000,58,'img/VotTennis.jpg','Bạn là sinh viên có đam mê với bộ môn tennis nhưng chi phí bỏ ra cho một bộ vợt quá đắt đỏ? Vậy thì hãy đến với chúng tôi, bạn sẽ được thỏa sức với đam mê mỗi ngày mà không cần phải bỏ ra quá nhiều chi phí. Vợt cho thuê của chúng tôi đảm bảo chất lượng và cho bạn những trải nghiệm tuyệt vời.'),(7,'Gay bong chay',80000,68,'img/GayBongChay.jpg','Gậy bóng chày (Baseball Bat) là một dụng cụ chuyên dụng dùng để tập luyện và thi đấu bộ môn bóng chày. Gậy thường được làm bằng gỗ hoặc kim loại, có thiết kế đặc biệt với một đầu nhỏ hơn để cầm tay và một đầu phinh to hơn để giúp đánh bóng chính xác. Theo quy định, gậy bóng chày có đường kính không quá 2,75 inch (7cm) ở phần dày nhất, chiều dài không quá 42 inch (1,067 m) và trọng lượng tối đa là 1kg. Tùy vào người sử dụng cũng như sở trường, lứa tuổi của họ mà các thông số này có thể nhỏ hơn.'),(8,'Vot cau long',30000,78,'img/VotCauLong.jpg','Vợt cầu lông là một thiết bị thể thao chuyên nghiệp dành cho môn cầu lông. Đây là môn thể thao giúp bạn tăng cường sức khỏe, phản xạ nhanh và giảm áp lực sau mỗi ngày làm việc dài nên được rất nhiều người lựa chọn.'),(9,'Vo phuc karate',80000,80,'img/Karate.jpg','Chất liệu võ phục: Vải 100% Cotton Nhật loại 50*43 nhập trực tiếp từ Nhật về, thấm hút mồ hôi tốt, vải nhẹ, mang thoáng. Là loại võ phục karate xịn tốt. Ưu điểm: Chuyên dành cho Kata, vải đanh khi thực hiện các bài KATA. Chuẩn Form Shureido, hàng cao cấp được RIKAIDO sản xuất chuyên dành cho Xuất Khẩu, chất lượng không thua kém hàng ngoại. Giá cả rẻ so với chất lượng tại VIệt Nam. Đảm bảo sự hài lòng cho các KarateKa.'),(10,'Han phuc',100000,69,'img/HanPhuc.jpeg','Hán phục là trang phục truyền thống của người Hán xuất hiện từ thế kỷ 17. Với lịch sử tồn tại hơn 4000 năm, Hán phục hiện là quốc phục lâu đời nhất thế giới. Cho đến ngày nay, người Trung Quốc vẫn mặc Hán phục vào những dịp quan trọng. Trải qua các thời kỳ, Hán phục có những thay đổi nhất định. Những chủ yếu có 3 biến thể sau: Pienfu: Gồm một áo kéo dài đến đầu gối mặc cùng với váy hoặc quần dài đến mắt cá chân. Changpao (Daofao): Trang phục một mảnh áo dài đến mắt cá chân. Shenyi: Là sự kết hợp giữa Pienfu và Changpao. Thiết kế tương đối đơn giản, với phần ống tay rộng viền thêu, bọc vải hoặc lụa tơ tằm, hoa văn trên vai cùng đai lưng để trang trí.'),(11,'Bao ho ha bo',80000,78,'img/BaoHoHaBo.jpg','Trong những năm gần đây, bảo hộ hạ bộ là sản phẩm không thể thiếu đối với những võ sĩ thi đấu chuyên nghiệp ở những môn võ mang tính đối kháng cao như: Taekwondo; Karatedo; Vovinam; Võ cổ truyền; Wushu Sanshou; Boxing; Pencal Silat; Muay, MMA… Nó không chỉ giúp bảo vệ phần quan trọng của cơ thể mà còn giúp võ sĩ có thể tự tin hơn trong thi đấu.Trong những năm gần đây, bảo hộ hạ bộ là sản phẩm không thể thiếu đối với những võ sĩ thi đấu chuyên nghiệp ở những môn võ mang tính đối kháng cao như: Taekwondo; Karatedo; Vovinam; Võ cổ truyền; Wushu Sanshou; Boxing; Pencal Silat; Muay, MMA… Nó không chỉ giúp bảo vệ phần quan trọng của cơ thể mà còn giúp võ sĩ có thể tự tin hơn trong thi đấu. Đi học võ với những bài tập thể chất, bài quyền hay tập luyện với bao cát để nâng cao các kỹ thuật đòn thế. Còn những bài tập đối kháng giúp bạn có thể thực hành các kỹ thuật được học và hiểu được cách vận dụng những đòn thế như thế nào là chính xác và hiệu quả nhất. Các bài tập đối kháng được khuyến khích luyện tập với bạn bè đồng môn, tuy nhiên các thương tích khi luyện tập là không thể tránh khỏi. Sử dụng bảo các dụng cụ bảo hộ trong quá trình luyện tập giúp bạn hạn chế các chấn thương đến mức tối đa, cho những buổi tập hiệu quả cao nhưng vẫn an toàn'),(12,'Ao dai',100000,80,'img/AoDai.jpg','Bạn sắp có một buổi trình diễn và cần gấp một mẫu áo dài đẹp nhưng lại không biết thuê ở đâu, vậy thì hãy đến với chúng tôi, ở đây có nhiều loại áo dài đẹp cho bạn lựa chọn với mức giá vô cùng phải chăng. Chất liệu vải mát, được vệ sinh sạch sẽ sau mỗi lần cho thuê nên bạn hãy yên tâm về độ an toàn cho da nhé!. Với đa dạng mẫu mã từ truyền thống đến cách tân, chắc chắn bạ sẽ hài lòng khi thuê áo dài bên chúng tôi.'),(13,'Ao ba ba',100000,68,'img/AoBaBa.jpeg','Áo bà ba tượng trưng cho hình ảnh của người phụ nữ Việt Nam mạnh mẽ, kiên cường trong các cuộc chiến tranh chống giặc và giữ nước. Hình ảnh người phụ nữ Nam Bộ luôn gắn với 3 vật bất ly thân: nón lá, khăn rằn, áo bà ba. Những hình ảnh của các chị, các mẹ xông pha trong chiến đấu vẫn đẹp và lung linh cho đến ngày nay. Áo bà ba không hề bị lãng quên theo thời gian. Dù cuộc sống có nhiều sự thay đổi, hội nhập nhưng ý nghĩa của chiếc áo bà ba vẫn tồn tại với cuộc sống của người Nam Bộ. Áo bà ba vẫn thường được sử dụng cho rất nhiều mục đích khác nhau như làm đồ biểu diễn văn nghệ, chụp hình kỷ yếu hay ở cả nhiều cuộc thi sắc đẹp cùng sử dụng áo bà ba, đưa hình ảnh áo bà ba đi khắp nơi. Từ một chiếc áo với hai màu cơ bản và đen và nâu, theo thời gian áo bà ba đã có sự biến đổi nhưng vẫn gần gũi và thân thuộc với đời sống của người Việt, không chỉ là con người Nam Bộ. Chiếc áo bà ba là trang phục truyền thống lâu đời của con người Việt.');
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-03 20:56:58
