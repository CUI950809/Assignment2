/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import business.Car;
import business.CarRepository;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author wangcong
 */
public class SelectFrame extends javax.swing.JFrame {

    private CarRepository carArrayList;

    /**
     * Creates new form SelectFrame
     */
    public SelectFrame() {
        initComponents();
    }

    public String[] setAddAllToArray(Set<String> set) {
        Object[] toArray = set.toArray();
        String[] result = new String[toArray.length + 1];
        result[0] = "All";
        for (int i = 0; i < toArray.length; i++) {
            result[i + 1] = String.valueOf(toArray[i]);
        }
        return result;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectPanel = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblmanufactureYear = new javax.swing.JLabel();
        lblSeatNumber = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblManufacturers = new javax.swing.JLabel();
        lblUpdateTime = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblWhetherMaintain = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        brandComboBox = new javax.swing.JComboBox<>();
        cityComboBox = new javax.swing.JComboBox<>();
        manufacturersComboBox = new javax.swing.JComboBox<>();
        seatNumberMinComboBox = new javax.swing.JComboBox<>();
        maintainComboBox = new javax.swing.JComboBox<>();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtManufactureYear = new javax.swing.JTextField();
        txtUpdateTime = new javax.swing.JTextField();
        seatNumberMaxComboBox = new javax.swing.JComboBox<>();
        lblTo = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 500));

        selectPanel.setBackground(new java.awt.Color(153, 204, 255));

        lblStatus.setBackground(new java.awt.Color(204, 204, 204));
        lblStatus.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblStatus.setText("Status");

        lblBrand.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblBrand.setText("Brand");

        lblmanufactureYear.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblmanufactureYear.setText("Manufacture Year");

        lblSeatNumber.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblSeatNumber.setText("Seat Number");

        lblSerialNumber.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblSerialNumber.setText("Serial Number");

        lblModelNumber.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblModelNumber.setText("Model Number");

        lblManufacturers.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblManufacturers.setText("Manufacturers");

        lblUpdateTime.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblUpdateTime.setText("Update time");

        lblCity.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCity.setText("City");

        lblWhetherMaintain.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblWhetherMaintain.setText("Whether Maintain");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"All", "available", "unavailable"}));

        brandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(setAddAllToArray(CarRepository.getBrands())));

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(setAddAllToArray(CarRepository.getCities())));

        manufacturersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(setAddAllToArray(CarRepository.getManufacturers())));

        seatNumberMinComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"...", "2", "4", "5", "7"}));

        maintainComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"All", "unexpired", "expired"}));

        seatNumberMaxComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"...", "2", "4", "5", "7"}));

        lblTo.setText("to");

        btnSearch.setBackground(new java.awt.Color(255, 255, 102));
        btnSearch.setText("Search Your Uber Car!");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Select your Uber");

        javax.swing.GroupLayout selectPanelLayout = new javax.swing.GroupLayout(selectPanel);
        selectPanel.setLayout(selectPanelLayout);
        selectPanelLayout.setHorizontalGroup(
            selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPanelLayout.createSequentialGroup()
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(selectPanelLayout.createSequentialGroup()
                                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(selectPanelLayout.createSequentialGroup()
                                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(selectPanelLayout.createSequentialGroup()
                                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSerialNumber))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(95, 95, 95))
                            .addGroup(selectPanelLayout.createSequentialGroup()
                                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPanelLayout.createSequentialGroup()
                                        .addComponent(lblManufacturers)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectPanelLayout.createSequentialGroup()
                                        .addComponent(lblUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manufacturersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)))
                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(selectPanelLayout.createSequentialGroup()
                                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSeatNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(selectPanelLayout.createSequentialGroup()
                                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblmanufactureYear)
                                    .addComponent(lblWhetherMaintain))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))))
                .addGap(23, 23, 23)
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addComponent(seatNumberMinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seatNumberMaxComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(brandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintainComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(selectPanelLayout.createSequentialGroup()
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectPanelLayout.setVerticalGroup(
            selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(lblBrand)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeatNumber)
                    .addComponent(lblCity)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNumberMinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNumberMaxComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTo))
                .addGap(41, 41, 41)
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(lblModelNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWhetherMaintain)
                            .addComponent(maintainComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(selectPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturers)
                            .addComponent(manufacturersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUpdateTime)
                    .addGroup(selectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUpdateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblmanufactureYear)
                        .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selectPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String status = statusComboBox.getSelectedItem().toString();
        String brand = brandComboBox.getSelectedItem().toString();
        String city = cityComboBox.getSelectedItem().toString();
        String manufacturers = manufacturersComboBox.getSelectedItem().toString();
        String maintain = maintainComboBox.getSelectedItem().toString();
        String seatNumberMin = seatNumberMinComboBox.getSelectedItem().toString();
        String seatNumberMax = seatNumberMaxComboBox.getSelectedItem().toString();

        String serialNumber = txtSerialNumber.getText();
        String modelNumber = txtModelNumber.getText();
        String manufactureYear = txtManufactureYear.getText();

        List<Car> fromCsvList = CarRepository.getCarList();
        List<Car> toTableList = new ArrayList();
        // question1
        for (Car car : fromCsvList) {
            if (!status.equals("All") && !status.equals(car.getStatus())) {
                continue;
            }
            if (!brand.equals("All") && !brand.equals(car.getBrand())) {
                continue;
            }
            if (!city.equals("All") && !city.equals(car.getCity())) {
                continue;
            }
            if (!manufacturers.equals("All") && !manufacturers.equals(car.getManufacturers())) {
                continue;
            }
            if (!maintain.equals("All") && !maintain.equals(car.getMaintain())) {
                continue;
            }
            if (StringUtils.isNotEmpty(serialNumber) && !serialNumber.equals(car.getSerialNumber())) {
                continue;
            }
            if (StringUtils.isNotEmpty(modelNumber) && !modelNumber.equals(car.getModelNumber())) {
                continue;
            }
            if (StringUtils.isNotEmpty(manufactureYear) && !manufactureYear.equals(car.getManufacturerYear())) {
                continue;
            }
            if (!"...".equals(seatNumberMin)) {
                int min = Integer.parseInt(seatNumberMin);
                if (min > car.getSeatNumber()) {
                    continue;
                }
            }
            if (!"...".equals(seatNumberMax)) {
                int max = Integer.parseInt(seatNumberMax);
                if (max < car.getSeatNumber()) {
                    continue;
                }
            }
            toTableList.add(car);
        }

        TableFrame tableFrame = new TableFrame(toTableList);
        //tableFrame.setToTableList(toTableList);
        tableFrame.setLocationRelativeTo(null);
        tableFrame.setLayout(null);
        tableFrame.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectFrame.class.getName())
                .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectFrame.class.getName())
                .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectFrame.class.getName())
                .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectFrame.class.getName())
                .log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelectFrame selectFrame = new SelectFrame();
                selectFrame.setLocationRelativeTo(null);
                selectFrame.setLayout(null);
                selectFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> brandComboBox;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblManufacturers;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblSeatNumber;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblUpdateTime;
    private javax.swing.JLabel lblWhetherMaintain;
    private javax.swing.JLabel lblmanufactureYear;
    private javax.swing.JComboBox<String> maintainComboBox;
    private javax.swing.JComboBox<String> manufacturersComboBox;
    private javax.swing.JComboBox<String> seatNumberMaxComboBox;
    private javax.swing.JComboBox<String> seatNumberMinComboBox;
    private javax.swing.JPanel selectPanel;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtUpdateTime;
    // End of variables declaration//GEN-END:variables
}
