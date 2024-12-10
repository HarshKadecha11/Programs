from django import forms
from django.contrib.auth.models import User
from .models import UserProfile, Document

class UserForm(forms.ModelForm):
    class Meta:
        model = User
        fields = ['username', 'email', 'password']

class UserProfileForm(forms.ModelForm):
    class Meta:
        model = UserProfile
        fields = ['full_name', 'address', 'phone']

class DocumentForm(forms.ModelForm):
    class Meta:
        model = Document
        fields = ['document']