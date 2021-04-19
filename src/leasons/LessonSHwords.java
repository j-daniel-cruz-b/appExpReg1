/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leasons;

import dialogs.EndDialog;
import dialogs.EndFrame;
import java.awt.Color;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import main.MainMenu;

/**
 *
 * @author DEVELOP17
 */
public class LessonSHwords extends javax.swing.JFrame {

    /**
     * Creates new form LessonFVwords
     */
    int level = 1;
    EndFrame pantallaFinal;
    MainMenu menu;
    LessonFV palabras;
    String NOMBRE_USUARIO;

    public LessonSHwords(String nUsuario) {
        initComponents();
        NOMBRE_USUARIO = nUsuario;
        this.setTitle("DUBI - Escuela [" + nUsuario + "]");
        getContentPane().setBackground(new Color(204, 138, 249));
        Image icon = new ImageIcon(getClass().getResource("../images/logo.png")).getImage();
        setIconImage(icon);
        this.panelEscuela.setVisible(true);
        this.panelCuaderno.setVisible(false);
        this.panelLapiz.setVisible(false);
        this.panelFinal.setVisible(false);
        this.panelMaestra.setVisible(false);
        this.panelPizzaron.setVisible(false);
        this.panelTarea.setVisible(false);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void arbol() {
        this.label1.setText("Mochila");
        this.label2.setText("Cuaderno");
        this.label3.setText("Lapiz");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/cuaderno.png"));
        this.panelCuaderno.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void naranja() {
        this.label1.setText("Lapiz");
        this.label2.setText("Escuela");
        this.label3.setText("Banco");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/lapiz.png"));
        this.panelLapiz.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void brocoli() {
        this.label1.setText("Maestra");
        this.label2.setText("Alumno");
        this.label3.setText("Perro");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/maestra.png"));
        this.panelInicio.setVisible(false);
        this.panelFinal.setVisible(true);
        this.panelMaestra.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void arbusto() {
        this.label1.setText("Escuela");
        this.label2.setText("Recreo");
        this.label3.setText("Pizarron");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/pizarron.png"));
        this.panelInicio.setVisible(false);
        this.panelFinal.setVisible(true);
        this.panelPizzaron.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }

    public void lechuga() {
        this.label1.setText("Tarea");
        this.label2.setText("Mochila");
        this.label3.setText("Maestra");
        this.labelImg.setIcon(new ImageIcon("src/images/bigs/tarea.png"));
        this.panelInicio.setVisible(false);
        this.panelFinal.setVisible(true);
        this.panelTarea.setVisible(true);
        this.btnSiguiente.setEnabled(false);
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }
    
    public void pantallaFinal(){
        pantallaFinal = new EndFrame(NOMBRE_USUARIO, 2);
        pantallaFinal.setVisible(true);
        this.dispose();
    }

    private void manzanaRevisar() {
        String cadena = this.textEscuela.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("escuela")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
                this.textEscuela.setEnabled(false);
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    private void arbolRevisar() {
        String cadena = this.textDuaderno.getText();
        String regExpString = "[a-zA-Z]{8}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("cuaderno")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
                this.textDuaderno.setEnabled(false);
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }
    
    private void naranjaRevisar() {
        String cadena = this.textLapiz.getText();
        String regExpString = "[a-zA-Z]{5}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("lapiz")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
                this.textLapiz.setEnabled(false);
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    private void brocoliRevisar() {
        String cadena = this.textMaestra.getText();
        String regExpString = "[a-zA-Z]{7}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("maestra")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    private void arbustoRevisar() {
        String cadena = this.textPizarron.getText();
        String regExpString = "[a-zA-Z]{8}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("pizarron")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
        
    }

    private void lechugaRevisar() {
        String cadena = this.textTarea.getText();
        String regExpString = "[a-zA-Z]{5}";
        Pattern pStr = Pattern.compile(regExpString);
        Matcher mStr = pStr.matcher(cadena);
        if (mStr.matches()) {
            cadena = cadena.toLowerCase().strip();
            if(!cadena.equals("tarea")){
                this.labelError.setVisible(true);
                this.labelError.setText("No es correcto :c");
            } else {
                this.btnSiguiente.setEnabled(true);
                this.labelCorrecto.setVisible(true);
                this.labelCorrecto.setText("Muy Bien!!");
            }
        } else {
            this.labelError.setVisible(true);
            this.labelError.setText("Faltan letras :c");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        btnRevisar = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnRegresarPalabras = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();
        labelCorrecto = new javax.swing.JLabel();
        panelInicio = new javax.swing.JPanel();
        panelLapiz = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textLapiz = new javax.swing.JTextField();
        panelEscuela = new javax.swing.JPanel();
        textEscuela = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelCuaderno = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textDuaderno = new javax.swing.JTextField();
        panelFinal = new javax.swing.JPanel();
        panelTarea = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textTarea = new javax.swing.JTextField();
        panelMaestra = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textMaestra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelPizzaron = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textPizarron = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 458));
        setPreferredSize(new java.awt.Dimension(570, 458));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        labelImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bigs/escuela.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImg, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnRevisar.setBackground(new java.awt.Color(255, 153, 153));
        btnRevisar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRevisar.setText("Revisar");
        btnRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevisarActionPerformed(evt);
            }
        });

        labelError.setBackground(new java.awt.Color(255, 0, 0));
        labelError.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 255, 255));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("No escribas números :c");
        labelError.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Posibles Palabras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        label3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Escuela");
        label3.setMinimumSize(new java.awt.Dimension(150, 34));
        label3.setPreferredSize(new java.awt.Dimension(150, 34));

        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Libro");
        label1.setMaximumSize(new java.awt.Dimension(100, 34));
        label1.setMinimumSize(new java.awt.Dimension(150, 34));
        label1.setPreferredSize(new java.awt.Dimension(150, 34));

        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Casa");
        label2.setMaximumSize(new java.awt.Dimension(100, 34));
        label2.setMinimumSize(new java.awt.Dimension(150, 34));
        label2.setPreferredSize(new java.awt.Dimension(150, 34));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSiguiente.setBackground(new java.awt.Color(255, 153, 153));
        btnSiguiente.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnRegresarPalabras.setBackground(new java.awt.Color(255, 153, 153));
        btnRegresarPalabras.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegresarPalabras.setText("Regresar a la Palabras");
        btnRegresarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPalabrasActionPerformed(evt);
            }
        });

        btnRegresarMenu.setBackground(new java.awt.Color(255, 153, 153));
        btnRegresarMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegresarMenu.setText("Regresar al Menú Principal");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });

        labelCorrecto.setBackground(new java.awt.Color(0, 204, 0));
        labelCorrecto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labelCorrecto.setForeground(new java.awt.Color(255, 255, 255));
        labelCorrecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCorrecto.setText("MuyBn!");
        labelCorrecto.setOpaque(true);

        panelInicio.setBackground(new java.awt.Color(102, 255, 102));

        panelLapiz.setBackground(new java.awt.Color(102, 255, 102));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("y un");

        textLapiz.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textLapiz.setMinimumSize(new java.awt.Dimension(80, 24));
        textLapiz.setPreferredSize(new java.awt.Dimension(80, 24));
        textLapiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textLapizMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLapizLayout = new javax.swing.GroupLayout(panelLapiz);
        panelLapiz.setLayout(panelLapizLayout);
        panelLapizLayout.setHorizontalGroup(
            panelLapizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLapizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(textLapiz, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLapizLayout.setVerticalGroup(
            panelLapizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLapizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLapizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textLapiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelEscuela.setBackground(new java.awt.Color(102, 255, 102));

        textEscuela.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textEscuela.setMaximumSize(new java.awt.Dimension(80, 24));
        textEscuela.setMinimumSize(new java.awt.Dimension(80, 24));
        textEscuela.setPreferredSize(new java.awt.Dimension(80, 24));
        textEscuela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textEscuelaFocusGained(evt);
            }
        });
        textEscuela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEscuelaMouseClicked(evt);
            }
        });
        textEscuela.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textEscuelaInputMethodTextChanged(evt);
            }
        });
        textEscuela.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textEscuelaPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("En la");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelEscuelaLayout = new javax.swing.GroupLayout(panelEscuela);
        panelEscuela.setLayout(panelEscuelaLayout);
        panelEscuelaLayout.setHorizontalGroup(
            panelEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscuelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEscuelaLayout.setVerticalGroup(
            panelEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEscuelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEscuelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        panelCuaderno.setBackground(new java.awt.Color(102, 255, 102));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("yo necesito un");

        textDuaderno.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textDuaderno.setMinimumSize(new java.awt.Dimension(80, 24));
        textDuaderno.setPreferredSize(new java.awt.Dimension(80, 24));
        textDuaderno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textDuadernoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCuadernoLayout = new javax.swing.GroupLayout(panelCuaderno);
        panelCuaderno.setLayout(panelCuadernoLayout);
        panelCuadernoLayout.setHorizontalGroup(
            panelCuadernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadernoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textDuaderno, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCuadernoLayout.setVerticalGroup(
            panelCuadernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadernoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuadernoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDuaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCuaderno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLapiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelCuaderno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelLapiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelFinal.setBackground(new java.awt.Color(102, 255, 102));

        panelTarea.setBackground(new java.awt.Color(102, 255, 102));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("y nos deja");

        textTarea.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textTarea.setMinimumSize(new java.awt.Dimension(80, 24));
        textTarea.setPreferredSize(new java.awt.Dimension(80, 24));
        textTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTareaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTareaLayout = new javax.swing.GroupLayout(panelTarea);
        panelTarea.setLayout(panelTareaLayout);
        panelTareaLayout.setHorizontalGroup(
            panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(textTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTareaLayout.setVerticalGroup(
            panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelMaestra.setBackground(new java.awt.Color(102, 255, 102));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("escribe");

        textMaestra.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textMaestra.setMinimumSize(new java.awt.Dimension(80, 24));
        textMaestra.setPreferredSize(new java.awt.Dimension(80, 24));
        textMaestra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textMaestraFocusGained(evt);
            }
        });
        textMaestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMaestraMouseClicked(evt);
            }
        });
        textMaestra.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textMaestraInputMethodTextChanged(evt);
            }
        });
        textMaestra.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textMaestraPropertyChange(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Mi");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout panelMaestraLayout = new javax.swing.GroupLayout(panelMaestra);
        panelMaestra.setLayout(panelMaestraLayout);
        panelMaestraLayout.setHorizontalGroup(
            panelMaestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaestraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textMaestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        panelMaestraLayout.setVerticalGroup(
            panelMaestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaestraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(textMaestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelPizzaron.setBackground(new java.awt.Color(102, 255, 102));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("en el");

        textPizarron.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        textPizarron.setMinimumSize(new java.awt.Dimension(80, 24));
        textPizarron.setPreferredSize(new java.awt.Dimension(80, 24));
        textPizarron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPizarronMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPizzaronLayout = new javax.swing.GroupLayout(panelPizzaron);
        panelPizzaron.setLayout(panelPizzaronLayout);
        panelPizzaronLayout.setHorizontalGroup(
            panelPizzaronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPizzaronLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(textPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPizzaronLayout.setVerticalGroup(
            panelPizzaronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPizzaronLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPizzaronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textPizarron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelFinalLayout = new javax.swing.GroupLayout(panelFinal);
        panelFinal.setLayout(panelFinalLayout);
        panelFinalLayout.setHorizontalGroup(
            panelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMaestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPizzaron, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFinalLayout.setVerticalGroup(
            panelFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMaestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelPizzaron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnRegresarPalabras)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(panelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelCorrecto))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnRegresarMenu)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnRevisar)
                                                    .addGap(134, 134, 134)
                                                    .addComponent(btnSiguiente))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelError)
                            .addComponent(labelCorrecto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRevisar)
                            .addComponent(btnSiguiente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 31, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarPalabras)
                    .addComponent(btnRegresarMenu))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        switch (level) {
            case 1:
                arbol();
                level++;
                break;
            case 2:
                naranja();
                level++;
                break;
            case 3:
                brocoli();
                level++;
                break;
            case 4:
                arbusto();
                level++;
                break;
            case 5:
                lechuga();
                level++;
                break;
            case 6:
                pantallaFinal();
                break;
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevisarActionPerformed
        switch (level) {
            case 1:
                manzanaRevisar();
                break;
            case 2:
                arbolRevisar();
                break;
            case 3:
                naranjaRevisar();
                break;
            case 4:
                brocoliRevisar();
                break;
            case 5:
                arbustoRevisar();
                break;
            case 6:
                lechugaRevisar();
                break;
        }
    }//GEN-LAST:event_btnRevisarActionPerformed

    private void btnRegresarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPalabrasActionPerformed
        palabras = new LessonFV(NOMBRE_USUARIO);
        palabras.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarPalabrasActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        menu = new MainMenu(NOMBRE_USUARIO);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void textEscuelaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textEscuelaPropertyChange
    }//GEN-LAST:event_textEscuelaPropertyChange

    private void textEscuelaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textEscuelaInputMethodTextChanged
    }//GEN-LAST:event_textEscuelaInputMethodTextChanged

    private void textEscuelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEscuelaMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textEscuelaMouseClicked

    private void textEscuelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textEscuelaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textEscuelaFocusGained

    private void textMaestraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textMaestraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaestraFocusGained

    private void textMaestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMaestraMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textMaestraMouseClicked

    private void textMaestraInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textMaestraInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaestraInputMethodTextChanged

    private void textMaestraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textMaestraPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_textMaestraPropertyChange

    private void textDuadernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textDuadernoMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textDuadernoMouseClicked

    private void textLapizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textLapizMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textLapizMouseClicked

    private void textPizarronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPizarronMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textPizarronMouseClicked

    private void textTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTareaMouseClicked
        this.labelError.setVisible(false);
        this.labelCorrecto.setVisible(false);
    }//GEN-LAST:event_textTareaMouseClicked

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
            java.util.logging.Logger.getLogger(LessonSHwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LessonSHwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LessonSHwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LessonSHwords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LessonSHwords("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnRegresarPalabras;
    private javax.swing.JButton btnRevisar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel labelCorrecto;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelImg;
    private javax.swing.JPanel panelCuaderno;
    private javax.swing.JPanel panelEscuela;
    private javax.swing.JPanel panelFinal;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelLapiz;
    private javax.swing.JPanel panelMaestra;
    private javax.swing.JPanel panelPizzaron;
    private javax.swing.JPanel panelTarea;
    private javax.swing.JTextField textDuaderno;
    private javax.swing.JTextField textEscuela;
    private javax.swing.JTextField textLapiz;
    private javax.swing.JTextField textMaestra;
    private javax.swing.JTextField textPizarron;
    private javax.swing.JTextField textTarea;
    // End of variables declaration//GEN-END:variables
}
