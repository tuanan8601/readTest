Mọi người ơi để tổng hợp kiến thức và làm ebook vất vả lắm ạ :(( Mọi người donate cho bọn mình thêm động lực tiếp tục làm tài liệu cho các môn tiếp theo nha (5k - 10k thui :)) ![](RackMultipart20210907-4-wdxci7_html_5d92969b93f55dce.png)

# Thông tin donate:

1. Momo, Airpay  - Sđt: 0968023065 (Trần Thị Hải Yến)

![](RackMultipart20210907-4-wdxci7_html_813b0dac666e34a3.jpg) ![](RackMultipart20210907-4-wdxci7_html_48c2139013dbf8ad.jpg)

      MomoAirpay

1. Ngân hàng

![](RackMultipart20210907-4-wdxci7_html_b72319db35ab02fc.jpg)

Đây là lần đầu bọn mình biên soạn tài liệu nên sai sót là điều không thể tránh khỏi mong mọi người bỏ qua ạ :( .

Bọn mình đang trong quá trình hoàn thiện ebook, rất mong sẽ nhận được phản hồi và góp ý từ mọi người.

# **Thông tin liên hệ:**

Fanpage: Sitdebayquamon: [www.facebook.com/407ITNEU](http://www.facebook.com/407ITNEU)

Gmail: [Sitdebayquamon@gmail.com](mailto:Sitdebayquamon@gmail.com)

Tài liệu viết theo ý hiểu của tác giả và cũng nhằm mục đích giúp mọi người dễ hiểu dễ hình dung nên không thể tránh khỏi nhiều phần kiến thức trình bày có phần vắn tắt, chưa thể hiện được hết bản chất. Mọi người nên đối chiếu kiến thức của tài liệu với kiến thức trong giáo trình, slide để có kiến thức chính xác và toàn diện nhé.

Vì thời gian biên soạn gấp rút nên có nhiều phần bị trùng lặp, sai xót ☹ Mong mọi người thông cảm ạ.

Link bài giảng cơ sở dữ liệu:

[https://drive.google.com/file/d/1UwRmFsK0-3c6m62hC1KgkAVlX24hVQ\_P/view?usp=sharing](https://drive.google.com/file/d/1UwRmFsK0-3c6m62hC1KgkAVlX24hVQ_P/view?usp=sharing)

Các link pdf được đính kèm phía bên dưới chủ yếu được cắt ra từ file này.

Tài liệu sẽ phân chia các dạng bài thường gặp, mỗi dạng sẽ có 1 hoặc nhiều ví dụ minh hoạ để mọi người dễ hình dung.

Các dạng bài có thể xuất hiện trong đề thi:

# **Dạng 1:** Câu hỏi lý thuyết:

Thường mỗi đề thi sẽ có 1 câu hỏi lý thuyết. Dạng này thường chỉ là câu trình bày kiến thức đã học. Vì Môn Cơ sở dữ liệu được mang tài liệu vào phòng thi nên câu lý thuyết thường là câu ăn điểm. Mọi người chỉ cần đọc một lượt giáo trình, slide xác định vị trí thông tin nhanh hơn, rút ngắn thời gian làm bài

# **Dạng 2: Mô hình thực thể liên kết và mô hình quan hệ**

Biểu diễn mô hình thực thể liên kết, chuyển từ mô hình thực thể liên kết sang mô hình thực thể quan hệ.

## 2.1. Mô hình thực thể liên kết.

- Mô hình thực thể liên kết bao gồm thực thể, thuộc tính và mối quan hệ giữa các thực thể

- Mô hình thực thể liên kết được biểu diễn dưới dạng sơ đồ thực thể liên kết:

Quy ước:

- Hình chữ nhật biểu diễn thực thể
- Hình tròn (elip) biểu diễn các thuộc tính. Thuộc tính khoá thì được gạch chân
- Hình thoi biểu diễn các liên kết (quan hệ)

![](RackMultipart20210907-4-wdxci7_html_aea09cd86366c448.png)

Thực thể: là các đối tượng cần quản lý. Ví dụ về thực thể nhân viên:

![](RackMultipart20210907-4-wdxci7_html_a00cfded3b04cf3c.png)

Mối quan hệ giữa các thực thể (các gọi khác như liên kết, mối kết hợp,…):

- Liên kết 1 – 1: Mỗi đối tượng của thực thể thứ nhất tương ứng với 1 và chỉ 1 đối tượng của thực thể thứ 2 và ngược lại.

Ví dụ: mỗi giảng viên được cấp 1 và chỉ một máy tính. Một máy tính được cấp cho 1 và chỉ một giảng viên.

![](RackMultipart20210907-4-wdxci7_html_5a408b4221fa3676.png)

- Liên kết 1 – N: Mỗi đối tượng của thực thể thứ nhát tương ứng với nhiều đối tượng của thực thể thứ 2.

Ví dụ: Mỗi sinh viên thuộc một và chỉ 1 lớp. Mỗi lớp có nhiều sinh viên

![](RackMultipart20210907-4-wdxci7_html_b58e96e37cb8bf08.png)

- Liên kết N – N: Mỗi đối tượng của thực thể thứ nhất tương ứng với nhiều đối tượng của thực thể thứ 2 và ngược lại.

Ví dụ: Mỗi sinh viên có thể học nhiều môn học và ngược lại mỗi môn học có thể có nhiều sinh viên học.

![](RackMultipart20210907-4-wdxci7_html_fee067a140e5541d.png)

### **Ví dụ 2.1:**

Biểu diễn sơ đồ thực thể liên kết giữa các tập thực thể: **Giảng Viên** gồm các thông tin như Mã giảng viên, Họ và tên giảng viên, Khoa, Điện Thoại; **Sinh viên** gồm các thông tin như Mã sinh viên, Họ tên Sinh viên, Ngày sinh. **Giảng Viên** và **Sinh viên** liên quan với nhau qua **Lớp tín chỉ**. **Lớp tín chỉ** gồm thông tin như Mã lớp học, Tên lớp, Số tín chỉ, Lịch học, Giảng đường.

Giải:

![](RackMultipart20210907-4-wdxci7_html_2af8a1f2d6e18a77.png)

Các bước làm:

- Bước 1: Dựa vào đề bài xác định các thực thể, thuộc tính của chúng 🡪 Biểu diễn theo quy ước, chú ý gạch chân khoá chính.
- Bước 2: Xác định mối quan hệ giữa các thực thể (1-1, 1-N, N-N) dựa theo lý thuyết đã nêu ở trên
- Lưu ý: Liên kết cũng có thể có thuộc tính. Với quan hệ N-N, liên kết giữa chúng nên có ít nhất 1 thuộc tính 🡪 tiện cho việc chuyển thành mô hình quan hệ trong phần tiếp theo.

## 2.2. Mô hình quan hệ (Mô hình dữ liệu quan hệ)

- Quan hệ còn được gọi là bảng. Số các bộ (dòng – bản ghi) được gọi là lực lượng của quan hệ. Số các thành phần (cột – thuộc tính) được gọi là bậc của quan hệ.

- Mô hình quan hệ bao gồm một hoặc nhiều quan hệ.

- Thực thể và thuộc tính trong mô hình thực thể liên kết trở thành quan hệ và thuộc tính của quan hệ. Mối liên kết sẽ trở thành khoá ngoại.

\*\*\* Cách chuyển từ mô hình thực thể liên kết sang mô hình quan hệ:

Tập thực thể:

Mỗi thực thể chuyển thành một quan hệ cùng tên và danh sách thuộc tính. Thuộc tính khoá trở thành khoá chính của quan hệ

Ví dụ:

![](RackMultipart20210907-4-wdxci7_html_ccdf36351a5f5a47.png)

Liên kết 1 – 1:

Thuộc tính khoá bên này làm khoá ngoại bên kia hoặc ngược lại.

![](RackMultipart20210907-4-wdxci7_html_b14810d4ddf25a37.png)

Liên kết 1 – N:

Thuộc tính khoá bên 1 làm khoá ngoại bên nhiều.

![](RackMultipart20210907-4-wdxci7_html_7f27475afee8c897.png)

Liên kết N – N:

Chuyển thành quan hệ mới có khoá chính gồm 2 thuộc tính khoá của 2 quan hệ; thuộc tính của liên kết (nếu có) trở thành thuộc tính của quan hệ mới.

Ví dụ:

![](RackMultipart20210907-4-wdxci7_html_20bff635cd8e1a3d.png)

### Ví dụ 2.2:

Chuyển đổi mô hình thực thể liên kết từ kết quả ở ví dụ 2.1 thành mô hình quan hệ

GIANGVIEN (MaGV, HoTenGV, Khoa, DienThoai)

LOPTINCHI (MaLop, TenLop, SoTC, LichHoc, GiangDuong, MaGV)

SINHVIEN (MaSV, HoTenSV, NgaySinh)

HOC (MaLop, MaSV, Diem)

# **Dạng 3:** Lược đồ quan hệ.

\*\* Giải thích một số thuật ngữ:

- Quan hệ: hiểu đơn giản là bảng

- Lược đồ quan hệ: Tập hợp tên thuộc tính của một quan hệ được gọi là lược đồ quan hệ 🡪 nói dễ hiểu là tập hợp tên các cột (trường của bảng)

## 3.1. Tìm bao đóng, phủ tối thiểu:

- Bao đóng:

[https://drive.google.com/file/d/1GpU4rhUQz9cgH37agGhFLo4V9KPhl9r2/view?usp=sharing](https://drive.google.com/file/d/1GpU4rhUQz9cgH37agGhFLo4V9KPhl9r2/view?usp=sharing)

- Phủ tối thiểu:

[https://drive.google.com/file/d/1C7Ob2gTet69MNp760tP305EBg8cHdGNV/view?usp=sharing](https://drive.google.com/file/d/1C7Ob2gTet69MNp760tP305EBg8cHdGNV/view?usp=sharing)

### **Ví dụ 3.1.1** :

Cho lược đồ quan hệ R = \&lt;U,F\&gt; với U = {A, B, C, D, E,I}

Và F= {BC -\&gt; DE, BE -\&gt; C, BI -\&gt; A, CE -\&gt; I}

Hãy chứng minh rằng BC -\&gt; A thuộc F+

_ **Giải** _

1. _Tính (BC)__+_

Bước 1: Đặt X0 = BC.

Bước 2: Tính các Xi

- X1 = BCDE (áp dụng BC -\&gt; DE).
- X2 = BCDEI (áp dụng BC -\&gt; E, CE-\&gt; I)
- X3 = ABCDEI (áp dụng BI -\&gt; A}

Bước 3: (BC)+ = ABCDEI

1. _Vì A_ _∈_(BC)+ nên BC -\&gt; A _∈_ _F__+_

## 3.2. Tìm khoá của lược đồ quan hệ:

Lý thuyết, các bước tìm khoá:

Link: [https://drive.google.com/file/d/1E9NQ7LHDlWjCqHXyJfbYlmrzHG5fsOyc/view?usp=sharing](https://drive.google.com/file/d/1E9NQ7LHDlWjCqHXyJfbYlmrzHG5fsOyc/view?usp=sharing)

**Ví dụ 3.2.1:** Cho lược đồ quan hệ R = \&lt;U, F\&gt;, Trong đó :

U = {ABC}

F = {A→B, B→A, C→B}

1. Tìm tập khóa của lược đồ này
2. Tìm khóa tối thiểu của lược đồ này

Giải

1. Tìm tập khóa của lược đồ

**Bước 1:** L = {ABC}    R = {AB}. Từ đó có: TN = U\R = {C} và TG = L ∩ R = {AB}

Bước 2: Vì TG # 0 nên ta làm tiếp bước 3

Bước 3: Ta có tập con Xi của tập TG = {0, A, B, AB}

Bước 4: tìm siêu khóa Si theo bảng sau:

| Xi | TN ∪ Xi | Bao đóng củaTN ∪ Xi | Kiểm tra(TN ∪ Xi)+ = U+ ? | Siêu khóa |
| --- | --- | --- | --- | --- |
| 0 | C | ABC | = U+ | C |
| A | AC | ABC | = U+ | AC |
| B | BC | ABC | = U+ | BC |
| AB | ABC | ABC | = U+ | ABC |

Vậy ta có tập siêu khóa S = {C, AC, BC, ABC}. //Nếu đề bài yêu cầu tìm tập siêu khoá thì dừng lại ở bước này//

Bước 5: Tuy nhiên, vì C chứa trong AC, BC và ABC nên loại bỏ siêu khóa AC, BC và ABC ra khỏi tập siêu khóa.

Vậy ta có, tập khóa K = {C} là khóa của lược đồ quan hệ

1. Tìm khóa tối thiểu của lược đồ

Bước 1: gán K0 =U+ tức là K= {ABC}

Bước 2: tính bao đóng của K\Ai và kiểm tra xem có loại thuộc tính này ra khỏi khóa được không qua bảng sau đây

| **Ai** | **K\Ai** | **(K\Ai)****+ **|** Kiểm tra (K\Ai) ****+**  **có bằng U**** + ****? **|** Có loại thuộc tính? **|** K** |
| --- | --- | --- | --- | --- | --- |
| A | BC | ABC | = U+ | Loại A | BC |
| B | C | ABC | = U+ | Loại B | C |

Vậy K={C}

## 3.3 Chuẩn hoá

Lý thuyết, các bước chuẩn hoá:

Link: [https://drive.google.com/file/d/1nN\_cytT8iS2O36WVwyp9iRaMumOEpOVv/view?usp=sharing](https://drive.google.com/file/d/1nN_cytT8iS2O36WVwyp9iRaMumOEpOVv/view?usp=sharing)

### **Ví dụ 3.3.1**

Cho lược đồ quan hệ

R= \&lt;U, F\&gt; với

U= {ABCDEFGHIJ} có khóa chính là A, B

Và

F = {AB -\&gt; CDEFGHIJ, A-\&gt; EFGHIJ, F-\&gt; IJ}

Hãy chuẩn hóa quan hệ R về dạng chuẩn 3NF

Giải

1. R đạt chuẩn 1NF
2. R không đạt chuẩn 2NF vì có phụ thuộc hàm A-\&gt; E,F,G,H,I,J nên phải tách thành 2 quan hệ

R1 có U1= {ABCD}

R2 có U2 = {AEFGHIJ}

1. R2 không thỏa mãn 3NF vì có phụ thuộc hàm F-\&gt; IJ (F không phải là thuộc tính khóa) nên phải tách thành 2 quan hệ mới

R21 có U21= {AEFGH}

R22 có U22= {FIJ)

Kết quả chúng ta có có 3 quan hệ: R1 với U1= {ABCD}, R21 với U21= {AEFGH} và R22 với U22= {FIJ}

### **Ví dụ 3.3.2**

Cho quan hệ R(SoHD, MaKH, TenKH, DiaChiKH, NgayDathang, {MaHang, TenHang, SoLuong, ThanhTien}) với dữ liệu cho trong bảng sau (giả thiết rằng đơn giá của mỗi mặt hàng không thay đổi)

| Số hóa đơn | Mã khách hàng | Tên Khách hàng | Địa chỉ khách hàng | Ngày đặt hàng | Mã hàng | Tên hàng | Số lượng | Đơn giá | Thành tiền |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | KH001 | Khách hàng số 1 | Hà Nội | 20/3/2020 | K001 | Kẹo mềm | 2 | 20000 | 40000 |
| B005 | Bánh xốp | 5 | 15000 | 75000 |
| N002 | Nước ngọt | 10 | 5000 | 50000 |
| 2 | KH002 | Khách hàng số 2 | Nam Định | 20/3/2020 | K002 | Kẹo cứng | 10 | 15000 | 150000 |
| B001 | Bánh quy | 4 | 2500 | 100000 |

Hãy chuẩn hóa quan hệ này đén 3NF

Giải

1. **Kiểm tra 1NF**

R với U = {SoHD, MaKH, TenKH, DiaChiKH, NgayDathang, {Mahang, Tenhang, SoLuong, DonGia, ThanhTien}}

Ta thấy, nhóm thuộc tính {Mahang, Tenhang, SoLuong, DonGia, ThanhTien} là thuộc tính đa trị nên quan hệ này chưa đạt chuấn hóa 1NF =\&gt; tách thành 2 quan hệ sau (và thuộc tính ThanhTien là thuộc tính thứ sinh (được suy ra từ các thuộc tính SoLuong và DonGia) nên sẽ loại bỏ)

R1 với U1= {SoHD, MaKH, TenKH, DiaChiKH, NgayDathang}

R2 với U2 = {SoHD, Mahang, Tenhang, SoLuong, DonGia}

Tương ứng với 2 bảng sau

DON\_DAT\_HANG

| Số hóa đơn | Mã Khách hàng | Tên Khách hàng | Địa chỉ khách hàng | Ngày đặt hàng |
| --- | --- | --- | --- | --- |
| 1 | KH001 | Khách hàng số 1 | Hà Nội | 20/3/2020 |
| 2 | KH002 | Khách hàng số 2 | Nam Định | 20/3/2020 |

HOADON\_MATHANG

| Số hóa đơn | Mã hàng | Tên hàng | Số lượng | Đơn giá |
| --- | --- | --- | --- | --- |
| 1 | K001 | Kẹo mềm | 2 | 20000 |
| 1 | B005 | Bánh xốp | 5 | 15000 |
| 1 | N002 | Nước ngọt | 10 | 5000 |
| 2 | K002 | Kẹo cứng | 10 | 15000 |
| 2 | B001 | Bánh quy | 4 | 2500 |

1. **Kiểm tra chuẩn 2NF**

R1 với U1= {SoHD, MaKH, TenKH, DiaChiKH, NgayDathang} đạt chuẩn 2NF

R2 với U2 = {SoHD, Mahang, Tenhang, SoLuong, DonGia} chưa đạt chuẩn 2NF vì có chứa phụ thuộc hàm: Mahang -\&gt; Tenhang, Dongia, nên tách thành 2 quan hệ sau:

R21 với U21 = {SoHoadon, Mahang,SoLuong}

R22 với U22 = {Mahang, Tenhang, DonGia}

Tương ứng với 2 bảng sau

HOADON\_MATHANG

| Số hóa đơn | Mã hàng | Số lượng |
| --- | --- | --- |
| 1 | K001 | 2 |
| 1 | B005 | 5 |
| 1 | N002 | 10 |
| 2 | K002 | 10 |
| 2 | B001 | 4 |

MAT\_HANG

| Mã hàng | Tên hàng | Đơn giá |
| --- | --- | --- |
| K001 | Kẹo mềm | 20000 |
| B005 | Bánh xốp | 15000 |
| N002 | Nước ngọt | 5000 |
| K002 | Kẹo cứng | 15000 |
| B001 | Bánh quy | 2500 |

1. **Kiểm tra chuẩn 3NF**

Ta thấy các quan hệ sau thỏa mãn 3NF

R21 với U21 = {SoHoadon, Mahang, SoLuong}

R22 với U22 = {Mahang, Tenhang, DonGia}

R1 với U1 = {SoHD, MaKH, TenKH, NgayDathang} không đạt chuẩn 3NF vì có thuộc tính bắc cầu: MAKH -\&gt; TenKH, DiaChiKH, nên tách thành hai quan hệ sau:

R11 với U11 - {SoHD, MaKH, NgayDathang}

R12 với U12 = {MaKH, TenKH, DiaChiKH}

Tương ứng với 2 bảng sau

DON\_DAT\_HANG

| Số hóa đơn | Mã khách hàng | Ngày đặt hàng |
| --- | --- | --- |
| 1 | KH001 | 20/3/2020 |
| 2 | KH002 | 20/3/2020 |

KHACH\_HANG

| Mã khách hàng | Tên Khách hàng | Địa chỉ khách hàng |
| --- | --- | --- |
| KH001 | Khách hàng số 1 | Hà Nội |
| KH002 | Khách hàng số 2 | Nam Định |

KL: Sau khi chuẩn hóa đến 3NF chúng ta có 4 quan hệ sau

R11 với U11 = {SoHD, MaKH, NgayDathang}

R12 với U12 = {MaKH, TenKH, DiaChiKH}

R21 với U21 = {SoHoadon, Mahang,SoLuong}

R22 với U22 = {Mahang, Tenhang, DonGia}

P/S: có thể tóm tắt các bước chuẩn hóa theo bảng sau đây

| Chưa chuẩn hóa | 1NF | 2NF | 3NF |
| --- | --- | --- | --- |
| **DON\_DAT\_HANG** SoHDMaKHTenKHDiaChiKHNgayDathangMaHang (R)TenHang (R)SoLuong (R)DonGia (R)~~ThanhTien (R, S)~~ | **DON\_DAT\_HANG** SoHDMaKHTenKHDiaChiKHNgayDathang



**HOADON\_MATHANG** SoHDMaHangTenHangSoLuongDonGia |



============🡺





**HOADON\_MATHANG** SoHDMahangSoLuong

**MATHANG** MaHangTenHangDonGia | **DON\_DAT\_HANG** SoHDMaKHNgayDathang

**KHACH\_HANG** MaKHTenKHDiaChiKH



==========🡺



==========🡺
|

### **Ví dụ 3.3.3**

Cho quan hệ

PHONGBAN (MaPB, TenPB, DiaChi, DTnoibo)

với dữ liệu được cho dưới dạng bảng sau

**PHÒNG BAN**

| **Mã phòng ban** | **Tên phòng ban** | **Địa chỉ** | **Điện thoại nội bộ** |
| --- | --- | --- | --- |
| 1 | Ban giám đốc | Hà Nội | 1111 |
| 2 | Phòng hành chính | Hà Nội | 1112 |
| 3 | Phòng NCKH | Hà Nội | 2111 |
| Huế | 2112 |
| TP HCM | 2113 |
| 4 | Phòng kỹ thuật | Hà Nội | 3111 |
| Huế | 3112 |
| TP HCM | 3113 |

Hãy kiểm tra xem quan hệ này đã đạt chuẩn 1NF hay chưa? Nếu chưa, hãy chuẩn hóa về 1NF

**Giải**

Quan hệ này vi phạm, chuẩn 1NF vì thuộc tính SoDTnoibo và Địa điểm là đa trị. Cần tách thành hai quan hệ sau

PHONGBAN (MaPB, TenPB)

PHONGBAN\_DIACHI (MaPB, DiaChi, Dtnoibo)

PHÒNG BAN

| **Mã phòng ban** | **Tên phòng ban** |
| --- | --- |
| 1 | Ban giám đốc |
| 2 | Phòng hành chính |
| 3 | Phòng NCKH |
| 4 | Phòng kỹ thuật |

PHÒNG BAN\_DIACHI

| Mã phòng ban | Địa chỉ | Điện thoại nội bộ |
| --- | --- | --- |
| 1 | Hà Nội | 1111 |
| 2 | Hà Nội | 1112 |
| 3 | Hà Nội | 2111 |
| 3 | Huế | 2112 |
| 3 | TP HCM | 2113 |
| 4 | Hà Nội | 3111 |
| 4 | Huế | 3112 |
| 4 | TP HCM | 3113 |

### **Ví dụ 3.3.4**

Xét CSDL gồm 2 lược đồ quan hệ sau đây

HOCPHAN (MaHP, TenHP)

DIEMTHI (MaHP, MaSV, TenSV, NgaySinh, Diem)

Tương ứng với hai bảng sau đây

| Mã học phần | Tên học phần |
| --- | --- |
| Ti01 | Tin học đại cương |
| Ht01 | Tin học ứng dụng |
| Ti02 | Cơ sở dữ liệu |

DIEMTHI

| Mã học phần | Mã sinh viên | Tên sinh viên | Ngày sinh | Điểm |
| --- | --- | --- | --- | --- |
| Ti01 | CQ610001 | Nguyễn An | 4/5/2000 | 7.5 |
| Ti01 | CQ610002 | Lê Ngọc Anh | 12/7/2000 | 8.0 |
| Ti01 | CQ612000 | Vũ Văn Thanh | 15/8/2000 | 5.0 |
| Ht01 | CQ602019 | Phạm Lan Hương | 3/7/1999 | 8.5 |
| Ht01 | CQ601190 | Hoàng Văn Hậu | 9/10/1998 | 6.0 |
| Ti02 | CQ590007 | Vũ Lan Ngọc | 14/5/1997 | 9.5 |
| Ti002 | CQ590018 | Hoàng Văn Thụ | 19/9/1007 | 4.5 |

Hãy kiểm tra xem quan hệ này đã đạt chuẩn 2NF hay chưa? Nếu chưa, hãy chuẩn hóa về 2NF.

**Giải:**

Quan hệ HOCPHAN (MaHP, TenHP) đạt chuẩn 2NF

Quan hệ DIEMTHI (MaHP, MaSV, TenSV, NgaySinh, Diem) không đạt chuẩn 2NF vì có sự phụ thuộc MaSV -\&gt; TenSV, NgaySinh nên phải tách thành 2 quan hệ

DIEMTHI (MaHP, MaSV, Diem) và SINHVIEN (MaSV, TenSV, NgaySinh)

### **Ví dụ 3.3.5**

Cho lược đồ quan hệ R = \&lt;U, F\&gt; với U= {ABCD} và tập phụ thuộc hàm

F= {AB-\&gt;C, B -\&gt; D, BC -\&gt; A}

Hãy kiểm tra xem R có đạt chuẩn 2NF hay không?

**Giải:**

**Bước 1:** Tìm tất cả các khóa của R. Xác định tập thuộc tính không khoá.

Ta có L = {ABC}, R = {ACD}, TN = {B}, TG = {AC}

Vì TG # 0 và tập con Xi của tập TG = {0, A, C, AC}

Tìm siêu khóa Si theo bảng sau:

| Xi | TN Xi | Bao đóng củaTN Xi | Kiểm tra(TN Xi)+ = U+ ? | Siêu khóa |
| --- | --- | --- | --- | --- |
| 0 | B | BD | != U+ |
|
| A | AB | ABCD | = U+ | AB |
| C | BC | ABCD | = U+ | BC |
| AC | ABC | ABCD | = U+ | ABC |

Loại bỏ khóa ABC vì chứa AB và BC, ta có tập siêu khóa S = {AB, BC}.

Vậy các thuộc tính khóa là {A, B, C} và thuộc tính không khóa là {D}

**Bước 2:** Tính (Xi)+ trong đó Xi là tập con thực sự của các khóa K.

- X1+ =A+ = A
- X2+ = B + = BD
- X3+ = C + = C

**Bước 3:** Vì X2+ chứa thuộc tính không khoá của D nên R không đạt chuẩn 2NF.

_Cách 2: Khóa là AB, mà có phụ thuộc hàm B-\&gt;D có D phụ thuộc vào 1 bộ phận của khóa =\&gt; Nên ko đạt chuẩn 2NF._

### Ví dụ 3.3.6

Cho lược đồ quan hệ R = \&lt;U, F\&gt; với U = {ABCD) và

F = {AB-\&gt;C, D -\&gt; B, C -\&gt; ABD}

Hãy kiểm tra xem R có đạt chuẩn 3NF?

**Giải**

**Bước 1:** Tìm tất cả các khóa của R

1. L = {ABCD}    R = {ABCD}. Từ đó có: TN = U\R = {0} và TG = L Ç R = {ABCD}
2. Vì TG # 0 và tập con Xi của tập TG = {0, A, C, B, C, D, AB, AC, AD, BC, BD, CD, ABC, ABD, BCD, ABCD}
3. Tìm siêu khóa Si theo bảng sau:

| Xi | TN Xi | Bao đóng củaTN Xi | Kiểm tra(TN Xi)+ = U+ ? | Siêu khóa |
| --- | --- | --- | --- | --- |
| A | A | A | != U+ |
|
| B | B | B | != U+ |
|
| C | C | ABCD | = U+ | C |
| AB | AB | ABCD | = U+ | AB |
| AC | AC | ABCD | = U+ | AC |
| AD | AD | ABCD | = U+ | AD |
| BC | BC | ABCD | = U+ | BC |
| BD | BD | BD | != U+ |
|
| CD | CD | ABCD | = U+ | CD |
| ABC | ABC | ABCD | = U+ | ABC |
| ABD | ABD | ABCD | = U+ | ABD |
| BCD | BCD | ABCD | = U+ | BCD |
| ABCD | ABCD | ABCD | = U+ | ABCD |

**u**

Sau khi loại bỏ các thuộc tính chứa khóa {C} và khóa {AB} chúng ta có tập khóa

K = {C, AB, AD}

**Bước 2:** tập thuộc tính không khóa là {0}

**Bước 3:** Mọi phụ thuộc hàm đều có vế phải là thuộc tính khóa nên R đạt chuẩn 3NF.

1.
## Bảo toàn thông tin

### Thuật toán bảo toàn thông tin:

Bước 1: Lập bảng ban đầu có k hàng (ứng với k lược đồ quan hệ con), n cột ứng với n tập thuộc tính {A1, A2 ,…,An }. Hàng i ứng với lược đồ quan hệ Ui , cột j ứng với thuộc tính Aj . Tại ô (i, j) điền ký hiệu aj nếu Aj ∈ Ui , ngược lại nếu Aj∉ Ui ta điền ký hiệu bij (trong đó aj , bij thuộc miền xác định của Aj ).

Bước 2: Xét lần lượt phụ thuộc hàm trong F và áp dụng các phụ thuộc hàm này cho bảng vừa xây dựng. Giả sử, ta đang xét phụ thuộc hàm X → Y ∈ F: Nếu tồn tại các dòng dữ liệu có giá trị bằng nhau trên tập thuộc tính X thì làm bằng giá trị của chúng trên tập thuộc tính Y theo nguyên tắc sau: Nếu thấy một ký hiệu tương ứng với Y là aj thì đồng nhất các ký hiệu này là aj, ngược lại thì đồng nhất bằng một trong các ký hiệu bij

Bước 3: Tiếp tục áp dụng các phụ thuộc hàm cho bảng (kể cả việc lặp lại các phụ thuộc hàm đã được áp dụng) cho đến khi không thay đổi giá trị trong bảng hoặc đến khi xuất hiện một dòng toàn ký hiệu a1 , a2 , a3 ,....ai ,...,an .

Bước 4: Cuối cùng, xem bảng kết quả: Nếu tồn tại một dòng toàn ký hiệu a1 , a2 , a3 ,....ai ,...,an thì kết luận phép tách là bảo toàn thông tin, ngược lại thì kết luận phép tách không bảo toàn thông tin

### **Ví dụ 3.4.1**

Cho quan hệ: **R(MaSV, MaMonhoc, Diem)**

Với dữ liệu được cho trong bảng sau

| Mã sinh viên | Mã môn học | Điểm |
| --- | --- | --- |
| CQ590001 | Ti01 | 7 |
| CQ590002 | Ti01 | 8 |
| CQ590003 | Ti01 | 5 |
| CQ590004 | Hi01 | 6 |
| CQ590004 | Ti02 | 8 |

Nếu tách quan hệ R thành 2 quan hệ **R1(MaSV, MaMonhoc)** và **R2 (MaMonhoc, Diem)** như sau

R1

| Mã sinh viên | Mã môn học |
| --- | --- |
| CQ590001 | Ti01 |
| CQ590002 | Ti01 |
| CQ590003 | Ti01 |
| CQ590004 | Hi01 |
| CQ590004 | Ti02 |

Và

R2

| Mã môn học | Điểm |
| --- | --- |
| Ti01 | 7 |
| Ti01 | 8 |
| Ti01 | 5 |
| Hi01 | 6 |
| Ti02 | 8 |

Hãy kiểm tra xem phép tách này có bị mất mát thông tin hay không?

**Giải**

Thực hiện phép kết nối tự nhiên 2 quan hệ R1\*R2 ta có

| Mã sinh viên | Mã môn học | Điểm |
| --- | --- | --- |
| CQ590001 | Ti01 | 7 |
| CQ590001 | Ti01 | 8 |
| CQ590001 | Ti01 | 5 |
| CQ590002 | Ti01 | 7 |
| CQ590002 | Ti01 | 8 |
| CQ590002 | Ti01 | 5 |
| CQ590003 | Ti01 | 7 |
| CQ590003 | Ti01 | 8 |
| CQ590003 | Ti01 | 5 |
| CQ590004 | Hi01 | 6 |
| CQ590004 | Ti02 | 8 |

Như vậy khi nối tự nhiên hai bảng ta nhận được quan hệ không giống quan hệ ban đầu =\&gt; Phép phân rã trên là mất thông tin

### Ví dụ 3.4.2

Cho R = \&lt;U,F\&gt; với U = {ABCDE} và

F = { A 🡪 C, B 🡪 C, C 🡪 D, DE 🡪 C, CE 🡪 A}

Giả sử R được tách thành D = {U1, U2, U3, U4, U5} với

U1 = {AD}, U2 = {AB}, U3 = {BE}, U4 = {CDE} và U5 = {AE}.

Hãy sử dụng thuật toán để kiểm tra xem phép tách này có được bảo toàn thông tin hay không?

**Giải**

ta có bảng đầu tiên như sau:

| A | B | C | D | E |
| --- | --- | --- | --- | --- |
| a1 | b12 | b13 | a4 | b15 |
| a1 | a2 | b23 | b24 | b25 |
| b31 | a2 | b33 | b34 | a5 |
| b41 | b42 | a3 | a4 | a5 |
| a1 | b52 | b53 | b54 | a5 |

Do A 🡪 C và hai hàng bằng nhau trên A, chúng ta có thể làm bằng nhau các ký hiệu đối với các thuộc tính C, cụ thể b13, b23 và b53 thành b13

| A | B | C | D | E |
| --- | --- | --- | --- | --- |
| a1 | b12 | b13 | a4 | b15 |
| a1 | a2 | b13 | b24 | b25 |
| b31 | a2 | b33 | b34 | a5 |
| b41 | b42 | a3 | a4 | a5 |
| a1 | b52 | b13 | b54 | a5 |

Sử dụng B 🡪 C và hai hàng bằng nhau trên B, chúng ta có thể làm bằng nhau các ký hiệu đối với các thuộc tính C, cụ thể b33 thành b13

| A | B | C | D | E |
| --- | --- | --- | --- | --- |
| a1 | b12 | b13 | a4 | b15 |
| a1 | a2 | b13 | b24 | b25 |
| b31 | a2 | b13 | b34 | a5 |
| b41 | b42 | a3 | a4 | a5 |
| a1 | b52 | b13 | b54 | a5 |

Sử dụng C 🡪 D và hai hàng bằng nhau trên C, chúng ta có thể làm bằng nhau các ký hiệu đối với các thuộc tính D, cụ thể b24, b34, b54 thành a4

| A | B | C | D | E |
| --- | --- | --- | --- | --- |
| a1 | b12 | b13 | a4 | b15 |
| a1 | a2 | b13 | a4 | b25 |
| b31 | a2 | b13 | a4 | a5 |
| b41 | b42 | a3 | a4 | a5 |
| a1 | b52 | b13 | a4 | a5 |

Sử dụng DE 🡪 C và hai hàng bằng nhau trên DE, chúng ta có thể làm bằng nhau các ký hiệu đối với các thuộc tính D, cụ thể b13 thành a3

| A | B | C | D | E |
| --- | --- | --- | --- | --- |
| a1 | b12 | b13 | a4 | b15 |
| a1 | a2 | b13 | a4 | b25 |
| b31 | a2 | a3 | a4 | a5 |
| b41 | b42 | a3 | a4 | a5 |
| a1 | b52 | a3 | a4 | a5 |

Cuối cùng, sử dụng CE 🡪 A và hai hàng bằng nhau trên DE, chúng ta có thể làm bằng nhau các ký hiệu đối với các thuộc tính D, cụ thể b13 thành a3

| A | B | C | D | E |
| --- | --- | --- | --- | --- |
| a1 | b12 | b13 | a4 | b15 |
| a1 | a2 | b13 | a4 | b25 |
| a1 | a2 | a3 | a4 | a5 |
| a1 | b42 | a3 | a4 | a5 |
| a1 | b52 | a3 | a4 | a5 |

Trong bảng cuối cùng thu được có dòng giữa bao gồm các kí hiệu a. Do đó phép tách này không mất mát thông tin.

# **Dạng 4:** Đại số quan hệ và SQL

## 1. Đại số quan hệ

Lý thuyết:

[https://drive.google.com/file/d/17zcWyPwmiVOoFOOePRZ6yHgYQ78gw10Z/view?usp=sharing](https://drive.google.com/file/d/17zcWyPwmiVOoFOOePRZ6yHgYQ78gw10Z/view?usp=sharing)

## 2. SQL

Câu lệnh truy vấn điển hình

SELECT thuộc tính (tên cột) hoặc biểu thức số học

FROM tên bảng hoặc view

WHERE biểu thức điều kiện

Dạng tổng quát:

SELECT [DISTINCT] \&lt;d/s cột\&gt;|\*|\&lt;biểu thức số học\&gt;

FROM \&lt;d/s tên bảng\&gt;|\&lt;d/sách các view\&gt;

[WHERE \&lt;biểu thức điều kiện\&gt;]

[GROUP BY \&lt;d/s tên cột\&gt; [HAVING \&lt;biểu thức điều kiện\&gt;]]

[ORDER BY \&lt;d/s tên cột\&gt;|\&lt;biểu thức\&gt; [ASC|DESC]]

[UNION|INTERSECT|MINUS\&lt;câu truy vấn con\&gt;]

Trong đó WHERE có thể được biểu diễn dưới các dạng

WHERE [NOT] \&lt;Biểu thức\&gt; \&lt;phép so sánh\&gt; \&lt;biểu thức\&gt;

WHERE [NOT] \&lt;tên cột\&gt; [NOT] LIKE \&lt;xâu ký tự\&gt;

WHERE [NOT] \&lt;biểu thức\&gt; [NOT] IN ({danh sách| câu truy vấn}]

WHERE [NOT] EXISTS (\&lt;câu truy vấn con\&gt;)

WHERE [NOT]\&lt;biểu thức\&gt;\&lt;phép so sánh\&gt;{SOME|ANY|ALL( truy vấn con)}

WHERE [NOT] \&lt;biểu thức logic\&gt;

WHERE [NOT] \&lt;biểu thức logic\&gt; {AND|OR} [NOT] \&lt;biểu thức logic\&gt;

Link file pdf tổng hợp ngắn gọn về SQL:

[https://drive.google.com/file/d/1nFmPw-Hts-3CwQkP7ISPfjVFThv4TnVv/view?usp=sharing](https://drive.google.com/file/d/1nFmPw-Hts-3CwQkP7ISPfjVFThv4TnVv/view?usp=sharing)

## 3. Ví dụ:

### Ví dụ 4.1:

Cho CSDL QUAN LY ĐIỂM THI với lược đồ dữ liệu như sau

SINHVIEN(MaSV, HoTen, NgaySinh, GioiTinh, MaLop)

LOP(MaLop, TenLop)

MONHOC(MaMH, TenMH)

DIEM(MaSV, MaMH,DiemThi)

Yêu cầu:

1. Hãy dùng biểu thức đại số quan hệ và câu lệnh SQL để thực hiện các truy vấn sau:

## Q2.1.

Cho thông tin về những sinh viên sinh trước năm 2001, quê ở Hải phòng

### ĐSQH:

σNgaysinh \&lt;&#39;2001-1-1&#39;∧ Que=&#39;Hai Phong&#39;(SINHVIEN)

### SQL:

SELECT \*

FROM SINHVIEN

WHERE Ngaysinh \&lt;&#39;2001-1-1&#39;and Que=&#39;Hai Phong&#39;

## Q2.2.

Đưa ra danh sách gồm Mã sinh viên, Tên Sinh viên, Quê quán của lop &#39;SITDE06001&#39; có quê Hà Nội

### ĐSQH:

C1:

ΠMaSV,TenSV,Que(σSINHVIEN.Malop=Lop.Malop ∧ Lop.Malop=&#39;SITDE06001&#39;∧ Que=&#39;Ha Noi&#39; (SINHVIEN x LOP))

**C2:**

ΠMaSV,TenSV,Que(σQue=&#39;Ha Noi&#39; (SINHVIEN) \* σ Lop.Malop=&#39;SITDE06001&#39;(LOP)

### SQL:

C1:

SELECT MaSV, TenSV, Que

FROM SINHVIEN, LOP

WHERE SINHVIEN.Malop=Lop.Malop

AND Lop.Malop=&#39;SITDE06001&#39;

AND Que=&#39;Ha Noi&#39;

C2:

SELECT MaSV, TenSV, Que

FROM SINHVIEN

WHERE Que=&#39;Ha Noi&#39; AND Malop IN

(SELECT MaLop

FROM LOP

WHERE MaLop=&#39;SITDE06001&#39;)

## Query2.3

Đưa ra danh sách các sinh viên có điểm thi Môn học có mã môn học là &#39;Ti01&#39; tù 7 trở lên

### ĐSQH:

C1:

ΠMaSV,TenSV,DiemThi(σSINHVIEN.MaSV=Diem.MaSV ∧ MONHOC.MaMH=DIEM.MaMH ∧ MONHOC.MaMH =&#39;Ti01&#39;∧ DiemThi \&gt;=7&#39; (SINHVIEN x MONHOC x DIEM))

C2:

ΠMaSV, HoTen, Diem (SINHVIEN \* (Ơ DiemThi\&gt;=7 (DIEM ) \* Ơ MaMH=&quot;Ti01&quot;(DIEM))

### SQL:

C1:

SELECT SINHVIEN.MaSV, TenSV, DiemThi

FROM SINHVIEN, MONHOC,DIEM

WHERE SINHVIEN.MaSV=DIEM.MaSV

AND MONHOC.MaMH=DIEM.MaMH

AND Monhoc.MaMH=&#39;Ti01&#39;

AND DiemThi\&gt;=7

C2:

SELECT SINHVIEN.MaSV,TenSV,DiemThi

FROM SINHVIEN,DIEM

WHERE SINHVIEN.MaSV=DIEM.MASV

AND DiemThi\&gt;=7

AND MaMH in (SELECT MaMH

FROM MONHOC

WHERE MaMH=&#39;Ti01&#39;)

C3:

SELECT SINHVIEN.MaSV, TenSV, DiemThi, MaMH

FROM SINHVIEN Join DIEM on SINHVIEN.MaSV = Diem.MaSV

WHERE DiemThi \&gt;=7 AND MaMH in(SELECT MaMH

FROM MONHOC

WHERE MaMH=&#39;Ti01&#39;)

## Query2.4

Cho biết số SV học lớp SITDE06001

ĐSQH:

ΠMaSV, count() (SINHVIEN)

SQL:

SELECT COUNT(MaSV)

FROM SINHVIEN

WHERE MaLop=&#39;SITDE06001&#39;

## Query2.5

Đưa ra danh sách Mã môn học và tên các môn học được sinh viên quê Hải phòng chọn

### ĐSQH:

C1:

ΠMaMH,TenMH(σSINHVIEN.MaSV=Diem.MaSV ∧ MONHOC.MaMH=DIEM.MaMH ∧ Que=&#39;Hải phòng&#39;(SINHVIEN x MONHOC x DIEM))

C2:

ΠMaMH,TenMH(MONHOC \* (DIEM \* σ Que=&#39;Hải phòng&#39;(SINHVIEN))

C3:

ΠMaMH,TenMH(ΠMaMH,TenMHMONHOC \* (ΠMaSV,MaMH(DIEM) \* ΠMaSV(σ Que=&#39;Hải phòng&#39;(SINHVIEN))

### SQL:

C1:

SELECT MONHOC.MaMH,TenMH

FROM MONHOC,SINHVIEN,DIEM

WHERE SINHVIEN.MaSV=DIEM.MaSV

AND MONHOC.MaMH=DIEM.MaMH

AND Que=&#39;Hai Phong&#39;

C2:

SELECT MaMH,TenMH

FROM MONHOC

WHERE MaMH IN(SELECT MaMH

FROM DIEM

WHERE MaSV IN(SELECT MaSV

FROM SINHVIEN

WHERE Que =&#39;Hai Phong&#39;))

C3:

SELECT MONHOC.MaMH, TenMH

FROM MONHOC JOIN DIEM on MONHOC.MaMH = DIEM.MaMH

JOIN SINHVIEN on DIEM.MaSV = SINHVIEN.MaSV

WHERE Que =&#39;Hai Phong&#39;

## Query2.6

Đưa ra danh sách các sinh viên học hai môn Ti01 và Hi01

ĐSQH:

C1:

ΠMaSV,TenSV(σSINHVIEN.MaSV=Diem.MaSV ∧ MONHOC.MaMH=DIEM.MaMH ∧ (MaMH=&#39;Ti01&#39; ∨ MaMH=&#39;Hi01&#39;)(SINHVIEN x MONHOC x DIEM))

C2: ΠMaSV,TenSV(SINHVIEN \* (DIEM \* (σMaMH=&#39;Ti01&#39; ∨ MaMH=&#39;Hi01&#39;(MONHOC))

C2: ΠMaSV,TenSV(ΠMaSV,TenSV(SINHVIEN) \* (ΠMaSV,MaMH(DIEM) \* (ΠMaMH(σMaMH=&#39;Ti01&#39; ∨ MaMH=&#39;Hi01&#39;(MONHOC)))

### SQL:

C1

SELECTDISTINCT SINHVIEN.MaSV, TenSV

FROM SINHVIEN, MONHOC, DIEM

WHERE SINHVIEN.MaSV = DIEM.MaSV

AND MONHOC.MAMH = DIEM.MaMH

AND(MONHOC.MaMH=&#39;Ti01&#39;OR MONHOC.MaMH=&#39;Hi01&#39;)

C2

SELECTDISTINCT SINHVIEN.MaSV, TenSV

FROM SINHVIEN JOIN DIEM on SINHVIEN.MaSV = DIEM.MaSV

join MONHOC on DIEM.MaMH=MONHOC.MaMH

WHERE MONHOC.MaMH=&#39;Ti01&#39;OR MONHOC.MaMH=&#39;Hi01&#39;

C3:

SELECTDISTINCT SINHVIEN.MaSV, TenSV

FROM SINHVIEN JOIN DIEM on SINHVIEN.MaSV = DIEM.MaSV

WHERE MaMH IN(SELECT MaMH

FROM MONHOC

WHERE MaMH=&#39;Ti01&#39;OR MaMH=&#39;Hi01&#39;)

C4:

SELECT MaSV, TenSV

FROM SINHVIEN

WHERE MaSV IN(SELECT MaSV

FROM DIEM

WHERE MaMH IN(SELECT MaMH

FROM MONHOC

WHERE MaMH=&#39;Ti01&#39;OR MaMH=&#39;Hi01&#39;))

### Ví dụ 4.2:

**Cho các lược đồ quan hệ như sau:**

NHANVIEN (MaNV, Hoten, Diachi, Ngaysinh)

DUAN (MaDA, TenDA, Chudautu, Ngansach)

THAMGIA (MaNV, MaDA, SogioLamviec)

_ **Câu 4:** _ Sử dụng đại số quan hệ để trả lời các câu hỏi sau:

- Tên các nhân viên có địa chỉ ở &quot;Hà Nội&quot;
- Đưa ra danh sách MaNV, Hoten, Ngaysinh của những nhân viên làm cho dự án có chủ đầu từ là &quot;VN01&quot;.
- Đưa ra tên nhân viên tham gia các dự án có tên &quot;Dự án số 1&quot; và &quot;Dự án số 3&quot;

_ **Câu 5:** _ Sử dụng ngôn ngữ SQL để trả lời câu hỏi sau:

- Có bao nhiêu nhân viên tham gia vào dự án có tên &quot;Dự án số 1&quot;
- Trung bình số giờ làm việc của từng nhân viên
- Số các nhân viên tham gia vào cả hai dự án có mã &quot;DA01&quot; và &quot;DA02&quot;
- Bổ sung thêm vào tệp THAMGIA hai dòng dữ liệu theo bản sau:

| MaNV | MaDA | SogioLamviec |
| --- | --- | --- |
| NV08 | DA03 | 20 |
| NV04 | DA03 | 30 |

Giải:

![](RackMultipart20210907-4-wdxci7_html_f890ef9203f7ed07.jpg) ![](RackMultipart20210907-4-wdxci7_html_9b0cb5a987a2e266.jpg)

# TỔNG HỢP CÁC ĐỀ MINH HOẠ

## Đề 1:

_ **Câu 1:** _

1. Trình bày về các thành phần của hệ quản trị CSDL

1. Mô hình thực thể liên kết là gì?

_ **Câu 2:** _

1. Biểu diễn sơ đồ thực thể liên kết giữa các tập thực thể: **Giảng Viên** gồm các thông tin như Mã giảng viên, Họ và tên giảng viên, Khoa, Điện Thoại; **Sinh viên** gồm các thông tin như Mã sinh viên, Họ tên Sinh viên, Ngày sinh. **Giảng Viên** và **Sinh viên** liên quan với nhau qua **Lớp tín chỉ**. **Lớp tín chỉ** gồm thông tin như Mã lớp học, Tên lớp, Số tín chỉ, Lịch học, Giảng đường.
2. Chuyển đổi mô hình thực thể liên kết từ kết quả câu a thành mô hình quan hệ.

_ **Câu 3:** _

Cho R(U) với U = {A, B, C, D, E, G}

Và tập phụ thuộc hàm F = {AC 🡪 E; BE 🡪 C; DG 🡪 B; BC 🡪 A}

1. Hãy tìm bao đóng của BDE
2. Tìm một khoá tối thiểu của lược đồ trên
3. Các phụ thuộc hàm BDE 🡪 C và BDG 🡪 C có thuộc F+ không?

**Cho các lược đồ quan hệ như sau:**

NHANVIEN (MaNV, Hoten, Diachi, Ngaysinh)

DUAN (MaDA, TenDA, Chudautu, Ngansach)

THAMGIA (MaNV, MaDA, SogioLamviec)

_ **Câu 4:** _ Sử dụng đại số quan hệ để trả lời các câu hỏi sau:

- Tên các nhân viên có địa chỉ ở &quot;Hà Nội&quot;
- Đưa ra danh sách MaNV, Hoten, Ngaysinh của những nhân viên làm cho dự án có chủ đầu từ là &quot;VN01&quot;.
- Đưa ra tên nhân viên tham gia các dự án có tên &quot;Dự án số 1&quot; và &quot;Dự án số 3&quot;

_ **Câu 5:** _ Sử dụng ngôn ngữ SQL để trả lời câu hỏi sau:

- Có bao nhiêu nhân viên tham gia vào dự án có tên &quot;Dự án số 1&quot;
- Trung bình số giờ làm việc của từng nhân viên
- Số các nhân viên tham gia vào cả hai dự án có mã &quot;DA01&quot; và &quot;DA02&quot;
- Bổ sung thêm vào tệp THAMGIA hai dòng dữ liệu theo bản sau:

| MaNV | MaDA | SogioLamviec |
| --- | --- | --- |
| NV08 | DA03 | 20 |
| NV04 | DA03 | 30 |

## Đề 2:

_ **Câu 1:** _ Cho cơ sở dữ liệu sau:

HH (MaHH, TenHH, DVT, Dongia, TrangThai): bảng hàng hoá

KH (MaKH, Hoten, Diachi, SoDT, Hinhthuc): bảng khách hàng

HD (SoHD, Ngaylap, Ngaygiao, Giatri, MaKH, Nguoilap): Bảng hoá đơn

CT\_HD (SoHD, MaHH, Soluong, Giaban): bảng chi tiết hoá đơn

Trong đó: TrangThai = 0: hết hàng, TrangThai = 1: có hàng.

Hinhthuc =1: Đại lý, Hinhthuc = 0: Bán lẻ.

1. Sử dụng Đại số quan hệ để trả lời các câu hỏi sau:

1. Cho biết thông tiên các khách hàng Đại lý mua hàng giao ngày 1/4/2019
2. Những khách hàng nào mua hàng có mã KH9876
3. Cho biết những khách hàng Bán lẻ mua có giá trị hoá đơn dưới 5 triệu đồng.

1. Sử dụng SQL để trả lời các câu hỏi sau:

1. Có bao nhiêu mặt hàng bán lẻ trong ngày 1/4/2019
2. Cho biết hàng hoá nào được bán nhiều nhất trong tháng 3/2019
3. Cho biết số lượng mặt hàng có mã KH123 không bán trong cả hai ngày 10 và 11/4/2019

_ **Câu 2** _: Cho lược đồ quan hệ α = \&lt;U,F\&gt;

Với U = {A, B, C, D, E, I} và F = {AC🡪IB, CD🡪EI, D🡪CB}

1. Tìm tất cả các khoá của lược đồ
2. Tìm dạng chuẩn cao nhất của lược đồ.
3. Tìm L = (AE+ AB)+ S+, với S là siêu khoá bất kỳ của α
4. Phụ thuộc hàm ABE🡪CI có thuộc F+ hay không?
5. Kiểm tra tính bảo toàn thông tin của phép tách: ρ = {ABC, ACI, BDE, ADI}

## Đề 3:

_ **Câu 1:** _ Cho cơ sở dữ liệu sau:

HH (MaHH, TenHH, DVT, Dongia, TrangThai): bảng hàng hoá

KH (MaKH, Hoten, Diachi, SoDT, Hinhthuc): bảng khách hàng

HD (SoHD, Ngaylap, Ngaygiao, Giatri, MaKH, Nguoilap): Bảng hoá đơn

CT\_HD (SoHD, MaHH, Soluong, Giaban): bảng chi tiết hoá đơn

Trong đó: TrangThai = 0: hết hàng, TrangThai = 1: có hàng.

Hinhthuc =1: Đại lý, Hinhthuc = 0: Bán lẻ.

1. Sử dụng Đại số quan hệ để trả lời các câu hỏi sau:

1. Cho biết thông tiên các khách hàng Đại lý mua hàng giao ngày 1/4/2020
2. Những khách hàng nào mua hàng có mã KH9876
3. Cho biết những khách hàng Bán lẻ mua có giá trị hoá đơn trên 5 triệu đồng.

1. Sử dụng SQL để trả lời cho các câu hỏi sau:

1. Có bao nhiêu mặt hàng bán lẻ trong ngày 1/4/2020
2. Cho biết hàng hoá nào được bán nhiều nhất trong tháng 3/2020
3. Cho biết số lượng mặt hàng có mã KH123 đã bán trong cả hai ngày 10 và 11/4/2020

_ **Câu 2:** _ Cho lược đồ quan hệ α = \&lt;U,F\&gt;

Với U = {A, B, C, D, E, I} và F = {AC🡪IB, CD🡪EI, D🡪CB}

1. Kiểm tra tập thuộc tính ABC có phải là một khoá của lược đồ không?
2. Tìm dạng chuẩn cao nhất của lược đồ.
3. Tính Tìm L = (CD+ AB)+ K+, với S là siêu khoá bất kỳ của α
4. Phụ thuộc hàm ABE🡪DI có thuộc F+ hay không?
5. Kiểm tra tính bảo toàn thông tin của phép tách: ρ = {ABC, ACI, BDE, ADI}

## Đề 4: Đề thi cuối kì K61

_Thời gian làm bài 90 phút_

_ **Câu 1:** _

a, Biểu diễn sơ đồ thực thể liên kết giữa các tập thực thể: Hướng dẫn viên gồm các thông tin như Mã HDV, Tên HDV, Ngày sinh, Địa chỉ, Số điện thoại; Tour gồm các thông tin như Mã Tour, Tên Tour, Hình trình, Giá Tour; Khách Hàng gồm các thông tin Mã KH, Tên KH, Địa chỉ, Số điện thoại. Hướng dẫn viên liên kết với Tour qua Hướng dẫn và được biết mỗi Hướng dẫn viên có thể Hướng dẫn nhiều tour khác nhau nhưng mỗi Tour chỉ có một hướng dẫn viên. Khách hàng và Tour liên kết với nhay qua đăng ký thông tin Thời gian và được biết mỗi Khách hàng có thể đang ký nhiều Tour và mỗi Tour có thể được đăng ký bởi nhiều khác hàng.

b, Chuyển đồ mô hình thực thể liên kết từ câu trên thành mô hình quan hệ

_ **Câu 2:** _

Cho R(U) với U = {A, B, C, D, E, G, H}

Với tập phụ thuộc hàm F = {C 🡪 E, CD 🡪 E, E 🡪 AG, EG 🡪 A, H 🡪 AD, B 🡪 E}

- Với tập X = {B, C, D} hãy tìm X+
- Tìm phủ tối thiểu của lược đồ trên
- Với phụ thuộc hàm AC 🡪 G và BD 🡪 G có thuộc F+ không?

Cho các lược đồ quan hệ như sau:

GV (MAGV, TENGV, DIACHI, SODT)

SV (MASV, TENSV, NAMSINH, QUEQUAN, EMAIL)

LOP (MAGV, MASV, GIANGDUONG)

_ **Câu 3:** _

Sử dụng đại số quan hệ để trả lời các câu hỏi sau:

- Thông tin của giao viên có số điện thoại &quot;0903456789&quot;
- Danh sách tên các sinh viên đã từng học ở giảng đường &quot;A2.610&quot;
- Danh sách sinh viên quê ở &quot;Nam Định&quot; và sinh năm 2001.

_ **Câu 4:** _

Sử dụng ngôn ngữ SQL để trả lời các câu hỏi sau:

- Số điện thoiạ của những giáo viên đã giảng dạy ở giảng đường &quot;A2.610&quot;
- Số lượng sinh viên đến từ &quot;Hà Giang&quot;
- Danh sách các giảng đườung mà sinh viên &quot;Trần Tuấn Anh&quot; đã ngồi học

_ **Câu 5:** _

Tạo tệp cơ sở dữ liệu từ lược đồ quan hệ SV với thuộc tính MASV không được bỏ trống và phải sắp xếp theo trật tự tăng dần của NAMSINH

## Đề 5: Đề cuối kì K58

Thời gian làm bài 90 phút

_ **Câu 1:** _

- Trình bày vắn tắt về mô hình dữ liệu phân cấp
- Tính khả hợp của hai quan hệ?

_ **Câu 2:** _

a, Biểu diễn sơ đồ thực thể liên kết giữa các tập thực thể: Khác hàng gồm các thông tin như Mã khách hàng, Tên khách hàng, Đơn vị công tác, Mã số thuế; Nhà cung cấp gồm các thông tin như Mã nhà cung cấp, Tên nhà cung cấp, Địa chỉ, Số điện thoại. Khách hàng và Nhà cung cấp liên quan với nhau thông qua Hàng hoá: Mã hàng, Tên hàng, Đơn giá.

b, Chuyển đổi mô hình thực thể liên kết từ câu trên thành mô hình quan hệ

_ **Câu 3:** _

Cho R(U) với U = {A, B, C, D, E, G}

Với tập phụ thuộc hàm F = {BD 🡪 G; CG 🡪 D; AE 🡪 C; CD 🡪 B}

- Với tập X = {C, E, G} hãy tìm X+
- Tìm khoá tối thiểu của lược đồ trên
- Với phụ thuộc hàm CEG 🡪 D và ACE 🡪 D có thuộc F+ không?

**Cho các lược đồ quan hệ như sau:**

DM (MAHH, TENHANG, XUATXU, DONGIA, MUCTHUE)

KHO (MAKHO, TENKHO, DIACHI, LOAIKHO, THUKHO)

HOADON (MAHD, MAHH, MAKHO, NGAYXUAT, SOLUONG)

_ **Câu 4:** _

Sử dụng đại số quan hệ để trả lời các câu hỏi sau:

- Các hàng hoá có mức thuế trên 10%
- Danh sách các kho thuộc loại &quot;Cấp1&quot;
- Các hàng hoá có xuất xứ từ &quot;Singapore&quot; và được xuất từ kho có địa chỉ &quot;Hoà Bình&quot;

_ **Câu 5:** _

Sử dụng ngôn ngữ SQL để trả lời các câu hỏi sau:

- Có bao nhiêu hàng hoá có xuất xứ từ &quot;India&quot;
- Hàng hoá có số lần xuất nhiều nhất
- Hoá đơn có giá trị xuất lớn nhất trong ngày &quot;18/06/2018&quot;
- Tạo tệp cơ sở dữ liệu từ lược đồ quan hệ MON với thuộc tính MAMON không được trống và phải sắp xếp theo trật tự tăng dần theo TENMON