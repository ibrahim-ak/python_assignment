# Generated by Django 2.2.4 on 2024-05-16 08:37

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Book_author_app', '0002_books_desc'),
    ]

    operations = [
        migrations.AddField(
            model_name='authors',
            name='notes',
            field=models.TextField(default='default'),
            preserve_default=False,
        ),
    ]