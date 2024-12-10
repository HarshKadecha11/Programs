from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login, logout
from .models import UserProfile, Document
from .forms import UserForm, UserProfileForm, DocumentForm

def signup(request):
    if request.method == 'POST':
        user_form = UserForm(request.POST)
        profile_form = UserProfileForm(request.POST)
        if user_form.is_valid() and profile_form.is_valid():
            user = user_form.save(commit=False)
            user.set_password(user_form.cleaned_data['password'])
            user.save()
            profile = profile_form.save(commit=False)
            profile.user = user
            profile.save()
            return redirect('login')
    else:
        user_form = UserForm()
        profile_form = UserProfileForm()
    return render(request, 'signup.html', {'user_form': user_form, 'profile_form': profile_form})

def login_view(request):
    if request.method == 'POST':
        username = request.POST['username']
        password = request.POST['password']
        user = authenticate(request, username=username, password=password)
        if user is not None:
            login(request, user)
            return redirect('profile')
        else:
            return render(request, 'login.html', {'error': 'Invalid credentials'})
    return render(request, 'login.html')

def logout_view(request):
    logout(request)
    return redirect('login')

def profile(request):
    if not request.user.is_authenticated:
        return redirect('login')
    profile = UserProfile.objects.get(user=request.user)
    return render(request, 'profile.html', {'profile': profile})

def upload_document(request):
    if not request.user.is_authenticated:
        return redirect('login')
    if request.method == 'POST':
        form = DocumentForm(request.POST, request.FILES)
        if form.is_valid():
            document = form.save(commit=False)
            document.user = request.user
            document.save()
            return redirect('profile')
    else:
        form = DocumentForm()
    return render(request, 'upload_document.html', {'form': form})

def edit_profile(request):
    if not request.user.is_authenticated:
        return redirect('login')
    profile = UserProfile.objects.get(user=request.user)
    if request.method == 'POST':
        user_form = UserForm(request.POST, instance=request.user)
        profile_form = UserProfileForm(request.POST, instance=profile)
        if user_form.is_valid() and profile_form.is_valid():
            user_form.save()
            profile_form.save()
            return redirect('profile')
    else:
        user_form = UserForm(instance=request.user)
        profile_form = UserProfileForm(instance=profile)
    return render(request, 'edit_profile.html', {'user_form': user_form, 'profile_form': profile_form})