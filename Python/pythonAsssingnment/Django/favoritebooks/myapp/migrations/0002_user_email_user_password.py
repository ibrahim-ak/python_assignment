# Generated by Django 5.0.6 on 2024-05-21 10:56

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('myapp', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='user',
            name='email',
            field=models.EmailField(default='defult', max_length=254),
            preserve_default=False,
        ),
        migrations.AddField(
            model_name='user',
            name='password',
            field=models.TextField(default='defult'),
            preserve_default=False,
        ),
    ]
