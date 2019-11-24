from django.conf.urls import include,url
from django.urls import path
from . import views


app_name='api'
urlpatterns = [
    path('image/<str:q>/',views.image_ch,name="image"),
]