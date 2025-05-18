package com.example;
// package com.example;


// import java.net.URL;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.ResourceBundle;

// import javafx.collections.FXCollections;
// import javafx.collections.ObservableList;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.fxml.Initializable;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.control.cell.PropertyValueFactory;
// import javafx.scene.control.TableColumn;
// import javafx.scene.control.TableView;

// public class TransactionsController implements Initializable{

//     ObservableList<Transaction> mylist = FXCollections.observableArrayList();

//     @FXML
//     private TableColumn<Transaction, Integer> transactionidcol;

//     @FXML
//     private TableColumn<Transaction, Integer> amountcol;

//     @FXML
//     private TableColumn<Transaction, Integer> customeridcol;

//     @FXML
//     private TableColumn<Transaction, String> datecol;

//     @FXML
//     private TableView<Transaction> mytable;

//     @FXML
//     private Label countllabel, sumlabel, minlabel, maxlabel, averagelabel;

//     @Override
//     public void initialize(URL url, ResourceBundle rb){
//         initializeCol();
//         loadData();
//         showsummary();
//     }

//     private void initializeCol(){

//         transactionidcol.setCellValueFactory(new PropertyValueFactory<>("transactionid"));
//         amountcol.setCellValueFactory(new PropertyValueFactory<>("amount"));
//         customeridcol.setCellValueFactory(new PropertyValueFactory<>("customerid"));
//         datecol.setCellValueFactory(new PropertyValueFactory<>("orderdate"));
//     }

//     private void loadData(){

//         mylist.clear();

//         ResultSet result = DatabaseHandler.displaytransactions();

//         try {
//             while (result.next())
//             {
//                 Integer tid = result.getInt("transaction_id");
//                 Integer amt = result.getInt("amount");
//                 Integer cid = result.getInt("customer_id");
//                 String orddate = result.getString("order_date");

//                 mylist.add(new Transaction(tid, amt, cid, orddate));
//             }

//         } catch (SQLException e){
//             e.printStackTrace();
//         }

//         mytable.setItems(mylist);
//     }

//     private void showsummary(){

//         ResultSet result = DatabaseHandler.countTransactions();

//         try {
//              while (result.next()){
//                 Integer count = result.getInt("transactioncount");
//                 countllabel.setText(count.toString());
//              }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//         result = DatabaseHandler.getAverageTransaction();

//         try {
//              while (result.next()){
//                 Integer count = result.getInt("transactionaverage");
//                 averagelabel.setText(count.toString());
//              }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//         result = DatabaseHandler.getMaxTransaction();

//         try {
//              while (result.next()){
//                 Integer count = result.getInt("maximum");
//                 maxlabel.setText(count.toString());
//              }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//         result = DatabaseHandler.getMinTransaction();

//         try {
//              while (result.next()){
//                 Integer count = result.getInt("minimum");
//                 minlabel.setText(count.toString());
//              }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//         result = DatabaseHandler.getSumTransaction();

//         try {
//             while (result.next()){
//                 Integer count = result.getInt("transactionsum");
//                 sumlabel.setText(count.toString());
//             }
//         } catch (Exception e) {
//             // TODO: handle exception
//         }

//     }


// }
