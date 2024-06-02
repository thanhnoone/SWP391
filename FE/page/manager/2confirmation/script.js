import { postList } from "../../../dummyData/postDemo.js";

// Start: Drop down
document.addEventListener("DOMContentLoaded", function () {
  const bell = document.getElementById("bell");
  const contentNotification = document.querySelector(".content-notification");
  const profileDropdownList = document.querySelector(".profile-dropdown-list");
  const profileDropdownBtn = document.querySelector(".profile-dropdown-btn");

  function toggleProfileDropdown() {
    profileDropdownList.classList.toggle("active");
    contentNotification.style.display = "none"; // Hide notification dropdown
  }

  function toggleNotificationDropdown() {
    contentNotification.style.display =
      contentNotification.style.display === "block" ? "none" : "block";
    profileDropdownList.classList.remove("active"); // Hide profile dropdown
  }

  bell.addEventListener("click", function () {
    toggleNotificationDropdown();
  });

  profileDropdownBtn.addEventListener("click", function () {
    toggleProfileDropdown();
  });

  // Close both dropdowns if the user clicks outside of them
  window.addEventListener("click", function (event) {
    if (
      !bell.contains(event.target) &&
      !contentNotification.contains(event.target)
    ) {
      contentNotification.style.display = "none";
    }
    if (
      !profileDropdownBtn.contains(event.target) &&
      !profileDropdownList.contains(event.target)
    ) {
      profileDropdownList.classList.remove("active");
    }
  });
});

// End: Drop down

// Start modal notification detail
document.addEventListener("DOMContentLoaded", function () {
  // Function to open the modal
  function openModal(notificationText) {
    const modal = document.getElementById("notificationModal");
    const notificationDetails = document.getElementById("notificationDetails");
    notificationDetails.innerText = notificationText;
    modal.style.display = "block";
  }

  // Function to close the modal
  function closeModal() {
    const modal = document.getElementById("notificationModal");
    modal.style.display = "none";
  }

  // Event listener for notification clicks
  const notificationLinks = document.querySelectorAll(
    ".content-notification ul li a"
  );
  notificationLinks.forEach((link) => {
    link.addEventListener("click", function (event) {
      event.preventDefault(); // Prevent default anchor behavior
      const notificationText = this.getAttribute("data-notification");
      openModal(notificationText);
    });
  });

  // Event listener for close button
  const closeButton = document.querySelector(".modal .close");
  closeButton.addEventListener("click", closeModal);

  // Close modal when clicking outside of the modal content
  window.addEventListener("click", function (event) {
    const modal = document.getElementById("notificationModal");
    if (event.target === modal) {
      closeModal();
    }
  });
});
// End modal notification detail

// Start modal create post
$(document).ready(function () {
  // Mở modal khi click vào nút "Tạo bài đăng"
  $(".btn-create").click(function () {
    $("#createPostModal").css("display", "block");
  });

  // Đóng modal khi click vào nút đóng hoặc bên ngoài modal
  $(".close, .modal").click(function () {
    $("#createPostModal").css("display", "none");
  });

  // Ngăn sự kiện click lan ra khỏi modal
  $(".modal-content").click(function (event) {
    event.stopPropagation();
  });

  // Submit form khi ấn nút "Tạo"
  $("#postForm").submit(function (event) {
    event.preventDefault();
    // Thực hiện xử lý tạo bài đăng ở đây
    // Sau khi tạo xong, có thể đóng modal bằng cách:
    $("#createPostModal").css("display", "none");
  });
});

//End modal create post

// Start: nva
$(document).ready(function () {
  $(".nva").click(function () {
    $(".wrapper").toggleClass("collapse");
    if ($(window).width() < 768) {
      // Nếu chiều rộng bé hơn 768px, thêm phần tìm kiếm vào
      $(".search").toggleClass("show-search");
    }
  });
});
// End: nva

// Function to build table with data
function buildTable(data) {
  var table = document.getElementById("tableBody");
  table.innerHTML = ""; // Clear existing table data
  data.forEach((e) => {
    var row = `<tr>
      <td><p>${e.C12_TITLE}</p></td>
      <td><p>${e.C12_PUBLISHED_DATE}</p></td>
      <td><a href="#">Xem</a></td>
      <td>
        <button>Duyệt</button>
        <button>Từ chối</button>
      </td>
    </tr>`;
    table.innerHTML += row;
  });
}

// Initial display of all posts
buildTable(postList);

// Search functionality
document
  .getElementById("searchForm")
  .addEventListener("submit", function (event) {
    event.preventDefault();
    const query = document.getElementById("searchInput").value.toLowerCase();
    const filteredPosts = postList.filter((post) =>
      post.C12_TITLE.toLowerCase().includes(query)
    );
    buildTable(filteredPosts);
  });

//        TEST JS TEST JS
// Get the current date
function getCurrentDate() {
  var currentDate = new Date();
  var day = String(currentDate.getDate()).padStart(2, '0');
  var month = String(currentDate.getMonth() + 1).padStart(2, '0');
  var year = currentDate.getFullYear();
  return day + '-' + month + '-' + year;
};
document.getElementById('currentDate').innerText = getCurrentDate();

// Submit form khi ấn nút "Tạo"
$("#postForm").submit(function (event) {
  event.preventDefault();
  // Thu thập dữ liệu từ form
  const newPostTitle = $("#postTitle").val();
  const newPostContent = $("#postContent").val();
  const newPostDate = getCurrentDate(); // Lấy ngày hiện tại

  // Tạo đối tượng bài đăng mới
  const newPost = {
    C12_POST_ID: postList.length + 1, // Tạo ID mới dựa trên số lượng bài đăng hiện tại
    C12_TITLE: newPostTitle,
    C12_CONTENT: newPostContent,
    C12_PUBLISHED_DATE: newPostDate,
    // Bạn cần cung cấp các giá trị khác nếu có
    // C12_MANAGER_ID: ...
    // C12_CENTER_ID: ...
  };

  // Thêm bài đăng mới vào mảng postList
  postList.push(newPost);

  // Cập nhật giao diện bảng
  buildTable(postList);

  // Đóng modal sau khi tạo xong
  $("#createPostModal").css("display", "none");
  // Làm mới form
  document.getElementById("postForm").reset();
});

const toggle = () => classList.toggle("active");

let profileDropdownList = document.querySelector(".profile-dropdown-list");
let btn = document.querySelector(".profile-dropdown-btn");

let classList = profileDropdownList.classList;

window.addEventListener("click", function (e) {
  if (!btn.contains(e.target)) classList.remove("active");
});


