package com.ca2groceries.shopping;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView milk,cheese,chicken,fruits,fish,bread,veg,med;
    private ImageView sauce,pasta,cereal,eggs;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });

        tShirts = (ImageView) findViewById(R.id.milk);
        sportsTShirts = (ImageView) findViewById(R.id.cheese);
        femaleDresses = (ImageView) findViewById(R.id.chicken);
        sweathers = (ImageView) findViewById(R.id.fruits);

        glasses = (ImageView) findViewById(R.id.fish);
        hatsCaps = (ImageView) findViewById(R.id.bread);
        walletsBagsPurses = (ImageView) findViewById(R.id.veg);
        shoes = (ImageView) findViewById(R.id.med);

        headPhonesHandFree = (ImageView) findViewById(R.id.sauce);
        Laptops = (ImageView) findViewById(R.id.pasta);
        watches = (ImageView) findViewById(R.id.cereal);
        mobilePhones = (ImageView) findViewById(R.id.eggs);

        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Dairy");
                startActivity(intent);
            }
        });
        sportsTShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fruits");
                startActivity(intent);
            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Meat");
                startActivity(intent);
            }
        });

        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fast food");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Kitchen essential");
                startActivity(intent);
            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fresh items");
                startActivity(intent);
            }
        });

        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fruits");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Readymade");
                startActivity(intent);
            }
        });

        headPhonesHandFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Vegetables");
                startActivity(intent);
            }
        });

        Laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Breakfast");
                startActivity(intent);
            }
        });

        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Breads");
                startActivity(intent);
            }
        });

        mobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this,
                        com.ca2groceries.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Medicines");
                startActivity(intent);
            }
        });
    }
}
