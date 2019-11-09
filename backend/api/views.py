from django.shortcuts import render
from rest_framework import status, generics
from rest_framework.filters import OrderingFilter
from rest_framework import status
from rest_framework.response import Response
from rest_framework.decorators import api_view, action

@api_view(['GET'])
def image_ch(reques,q) :
    print(q)
    return Response(data={"data":"ok"},status=status.HTTP_200_OK)