git branch | Where-Object { $_ -notmatch 'main' } | ForEach-Object { git branch -D $_.Trim() }
