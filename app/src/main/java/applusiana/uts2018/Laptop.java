package applusiana.uts2018;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Laptop extends AppCompatActivity {

    EditText etHarga;
    RadioGroup rgPpn;
    RadioButton rbPPN2, rbPPN3, rbPPN4, rbPPN5;
    CheckBox cbMousegame, cbHarddisk, cbOs;
    Button btnHitung, btnHapus;
    TextView tvHargaLaptop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);

        etHarga = findViewById(R.id.etHarga);
        rgPpn = findViewById(R.id.ppn);
        rbPPN2 = findViewById(R.id.ppn2);
        rbPPN3 = findViewById(R.id.ppn3);
        rbPPN4 = findViewById(R.id.ppn4);
        rbPPN5 = findViewById(R.id.ppn5);
        cbMousegame = findViewById(R.id.mouse);
        cbHarddisk = findViewById(R.id.harddisk);
        cbOs = findViewById(R.id.os);
        btnHitung = findViewById(R.id.btnHitung);
      /*  etTotalHarga = findViewById(R.id.etTotal);*/
        tvHargaLaptop = findViewById(R.id.hargaLaptop);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double hargaLaptop = Double.valueOf(etHarga.getText().toString());

                int id = rgPpn.getCheckedRadioButtonId();
                if (id == -1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Laptop.this);
                    builder.setMessage("Silahakan Pilih Jenis PPN");
                    builder.setNegativeButton("OK", null);
                    builder.create();
                    builder.show();
                } else if (id == R.id.ppn2) {
                    Double ppn1 = 2.0 / 100.0 * hargaLaptop;
                    hargaLaptop += ppn1;

                } else if (id == R.id.ppn3) {
                    Double ppn1 = 3.0 / 100.0 * hargaLaptop;
                    hargaLaptop += ppn1;

                } else if (id == R.id.ppn4) {
                    Double ppn1 = 4.0 / 100.0 * hargaLaptop;
                    hargaLaptop += ppn1;

                } else if (id == R.id.ppn5) {
                    Double ppn1 = 5.0 / 100.0 * hargaLaptop;
                    hargaLaptop += ppn1;
                }

                if (cbMousegame.isChecked()) {
                    hargaLaptop = hargaLaptop + 100000;
                }
                if (cbHarddisk.isChecked()) {
                    hargaLaptop = hargaLaptop + 550000;
                }
                if (cbOs.isChecked()) {
                    hargaLaptop = hargaLaptop + 350000;
                }

                String strTotalHarga = "Harga Laptop : Rp. " + " " + String.valueOf(hargaLaptop);
                tvHargaLaptop.setText(strTotalHarga);
            }
        });

        btnHapus = findViewById(R.id.btnBack);
        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(Laptop.this, MainActivity.class);
                startActivity(kembali);
            }
        });
    }
}

